
import React, { useState } from "react";


const PropertyCard = ({ location, bedrooms, bathrooms, type, price, imageUrl }) => {

  let [isButtonPressed, setButtonName] = useState ("Add to Cart") 

  const addCart = () => {
    setButtonName(isButtonPressed === "Add to Cart" ? "In Cart" : "Add to Cart" )
  }

  return (
    <div className="wrapper">
      <img src={imageUrl} width={300} height={250} alt= "property image" />
      <h3 className="location">Location: {location}</h3>
      <h3 className="bedrooms">Bedrooms: {bedrooms}</h3>
      <h3 className="bathrooms">Bathrooms: {bathrooms}</h3>
      <h3 className="type">Type: {type}</h3>
      <p className="price">Price: £{price}</p>
      <button classname="add-cart-button" onClick={addCart}>
        {isButtonPressed}
      </button>
    </div>
  );
}

export default PropertyCard;