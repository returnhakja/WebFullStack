import React from 'react';
import './App.css';

const Image = ({ img, idx }) => {
  return (
    <>
      <div className="img-item" key={img + idx}>
        <img src={img} alt=""></img>
      </div>
    </>
  );
};

export default Image;
