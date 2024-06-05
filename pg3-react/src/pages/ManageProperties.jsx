
import PropertyCard from "../forms/PropertyCard";
import PropertyForm from "../forms/PropertyForm";
import PropertyFilter from "../forms/PropertyFilter";
import sellersData from '../data/sellersData.json';


const ManageProperty =() => {
    return (
      <>
        <div className="mng-property">
        <p>New Property Registration</p>
        <br />
            <PropertyForm />       
        </div>

        <div className="fltr-property">
        <p>Search Properties</p>
        <br />
            <PropertyFilter />       
        </div>

        <div>
          {
            sellersData.properties.map((item) => (
              <PropertyCard{...item}/>              

            ))
          }
        </div>
        </>
      
  
  );
  }

export default ManageProperty;