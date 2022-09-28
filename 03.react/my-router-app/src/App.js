import './App.css';
import Home from './Home';
import { Link, NavLink, Outlet } from 'react-router-dom';

// function App({ children }) {
function App() {
  function activeStyle({ isActive }) {
    return {
      textDecoration: isActive ? 'underline' : undefined,
      fontSize: isActive ? '24px' : undefined,
    };
  }

  return (
    <div>
      <ul>
        <li>
          <NavLink to="/" style={activeStyle}>
            Home
          </NavLink>
        </li>
        <li>
          <Link to="/"> Home </Link>
        </li>
        <li>
          <Link to="/projects">Projects </Link>
        </li>
      </ul>
      <hr />
      {/* <div>{children}</div> */}
      <div>
        <Outlet></Outlet>
      </div>
    </div>
  );
}

export default App;
