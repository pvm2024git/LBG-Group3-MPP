import React, { useState } from 'react';

const PropertySearch = ({ setSearchCriteria }) => {
  const [price, setPrice] = useState('');
  const [bedrooms, setBedrooms] = useState('');
  const [bathrooms, setBathrooms] = useState('');
  const [garden, setGarden] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();
    setSearchCriteria({ price, bedrooms, bathrooms, garden });
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label>Min Price: </label>
        <input type="number" value={price} onChange={(e) => setPrice(e.target.value)} />
      </div>
      <div>
        <label>Min Bedrooms: </label>
        <input type="number" value={bedrooms} onChange={(e) => setBedrooms(e.target.value)} />
      </div>
      <div>
        <label>Min Bathrooms: </label>
        <input type="number" value={bathrooms} onChange={(e) => setBathrooms(e.target.value)} />
      </div>
      <div>
        <label>Garden: </label>
        <input type="checkbox" checked={garden} onChange={(e) => setGarden(e.target.checked)} />
      </div>
      <button type="submit">Search</button>
    </form>
  );
};

export default PropertySearch;
