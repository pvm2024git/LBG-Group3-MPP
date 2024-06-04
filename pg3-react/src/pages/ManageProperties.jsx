
import PropertyCard from "../components/PropertyCard"
import sellersData from '../data/sellersData.json';


const PropertyPage=() => {
    return (
      <>
      <h1 className="header">OUR PRoperties</h1>
      <div className="items-grid">
        {
          sellersData.properties.map((item)=> (
            <PropertyCard{...item}/>
          ))
        }
      </div>
      </>
  
  );
  }

export default PropertyPage;