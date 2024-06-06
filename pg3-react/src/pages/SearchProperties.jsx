import React, { useState, useEffect } from 'react';
import PropertySearch from './PropertySearch';
import PropertyList from './PropertyList';

const SearchProperties = () => {
  const [searchCriteria, setSearchCriteria] = useState({});
  const [filteredProperties, setFilteredProperties] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      const response = await fetch('http://localhost:8000/properties');
      const data = await response.json();
      setFilteredProperties(data);
    };

    fetchData();
  }, []);

  useEffect(() => {
    const fetchFilteredData = async () => {
      const response = await fetch('http://localhost:8000/properties');
      const data = await response.json();

      const filtered = data.filter(property => {
        const meetsPrice = searchCriteria.price ? property.price <= searchCriteria.price : true;
        const meetsBedrooms = searchCriteria.bedrooms ? property.bedrooms >= searchCriteria.bedrooms : true;
        const meetsBathrooms = searchCriteria.bathrooms ? property.bathrooms >= searchCriteria.bathrooms : true;
        const meetsGarden = searchCriteria.garden ? property.hasGarden === searchCriteria.garden : true;
        return meetsPrice && meetsBedrooms && meetsBathrooms && meetsGarden;
      });

      setFilteredProperties(filtered);
    };

    fetchFilteredData();
  }, [searchCriteria]);

  return (
    <div>
      <h1>Property Search</h1>
      <PropertySearch setSearchCriteria={setSearchCriteria} />
      <PropertyList properties={filteredProperties} />
    </div>
  );
};

export default SearchProperties;

  
