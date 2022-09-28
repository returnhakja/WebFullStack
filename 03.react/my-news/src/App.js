import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import NewsList from './NewsList';
import NewsItem from './NewsItem';
import Categories from './Categories';
import { useState, useCallback } from 'react';
import { useParams } from 'react-router-dom';

function App() {
  const [category, setCategory] = useState('');
  const selectCategory = useCallback((category) => setCategory(category), []);
  const { categoryValue } = useParams();
  return (
    // <div>
    //   <button onClick={getData}>요청</button>
    // </div>
    <div>
      <Categories
        category={categoryValue}
        setCategory={setCategory}
        onClick={selectCategory}
      ></Categories>
      <NewsList category={categoryValue}></NewsList>
    </div>
  );
}

export default App;
