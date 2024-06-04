
import React, { useState } from "react";


const PropertyCard = ({ location, bedrooms, bathrooms, type, price, imageUrl, showstatus }) => {

  let [isButtonPressed, setButtonName] = useState ("Withdraw property")
  let [isPropertyPressed, setPropertyName] = useState ("For SALE")

  const addCart = () => {
    setButtonName(isButtonPressed === "Withdraw property" ? "For Sale" : "Withdraw property" )
    setPropertyName(isPropertyPressed === "For SALE" ? "Property Withdrawn" : "For Sale")
  }

  return (
    <div className="wrapper">
      <img src={imageUrl} width={300} height={250} alt= "property image" />
      <h3 className="location">Location: {location}</h3>
      <h3 className="bedrooms">Bedrooms: {bedrooms}</h3>
      <h3 className="bathrooms">Bathrooms: {bathrooms}</h3>
      <h3 className="type">Type: {type}</h3>
      <p className="price">Price: £{price}</p>
      <p className="Propstatus">Property Status: {isPropertyPressed}</p>
      <button classname="add-cart-button" onClick={addCart}>
        {isButtonPressed}
      </button>
    </div>
  );
}

export default PropertyCard;