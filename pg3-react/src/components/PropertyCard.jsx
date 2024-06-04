
import React, { useState } from "react";


const PropertyCard = ({ location, bedrooms, bathrooms, type, price, imageUrl }) => {

  let [isButtonPressed, setButtonName] = useState ("Add to Cart") 

  const addCart = () => {
    setButtonName(isButtonPressed === "Add to Cart" ? "In Cart" : "Add to Cart" )
  }

  return (
    <div className="wrapper">
      <img src={imageUrl} width={200} height={250} alt= "property image" />
      <h3 className="location">{location}</h3>
      <h3 className="bedrooms">{bedrooms}</h3>
      <h3 className="bathrooms">{bathrooms}</h3>
      <h3 className="type">{type}</h3>
      <p className="price">£{price.toFixed(2)}</p>
      <button classname="add-cart-button" onClick={addCart}>
        {isButtonPressed}
      </button>
    </div>
  );
};

export default PropertyCard;