import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <nav>
    
      <h1>MPP Estate Agents</h1>
      <ul>
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/manageseller">Manage Seller</Link>
        </li>
        <li>
          <Link to="/managebuyer">Manage Buyer</Link>
        </li>
        <li>
          <Link to="/manageproperties">Manage Properties</Link>
        </li>
        <li>
          <Link to="/managebooking">Manage Booking</Link>
        </li>
      </ul>
      </nav>    
  );
}

export default Navbar;
