import React, { useState } from 'react';

function Counter() {
  const [number, setNumber] = useState(0);

  const onIncreases = () => {
    console.log('+1');
    setNumber((prevNumber) => prevNumber + 1);
  };
  const onDecrease = () => {
    console.log('-1');
    setNumber((prevNumber) => prevNumber - 1);
  };

  return (
    <div>
      <h1>{number}</h1>
      <button onClick={onIncreases}>+1</button>
      <button onClick={onDecrease}>-1</button>
    </div>
  );
}

export default Counter;