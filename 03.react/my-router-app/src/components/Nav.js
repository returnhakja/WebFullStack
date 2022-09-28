import React from 'react';
import { Link, NavLink, Outlet } from 'react-router-dom';
function NotFound() {
  return (
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
  );
}

export default NotFound;
