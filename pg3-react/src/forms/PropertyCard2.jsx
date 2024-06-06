import React from 'react';

const PropertyCard2 = ({ property }) => {
  return (
    <div>
      <img src={property.imageUrl} alt={`${property.location} property`} />
      <h2>{property.location}</h2>
      <p>Price: £{property.price}</p>
      <p>Bedrooms: {property.bedrooms}</p>
      <p>Bathrooms: {property.bathrooms}</p>
      <p>Type: {property.type}</p>
    </div>
  );
};

export default PropertyCard2;