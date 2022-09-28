import './App.css';
import axios from 'axios';
import React, { useEffect, useState } from 'react';
import './weather.css';

// const response = axios.get(
//   'https://api.openweathermap.org/data/2.5/weather?q=busan&appid=fa8f595a007aaa4d48ab5eb6ce037a33'
// );

function App() {
  const [weather, setWeather] = useState([]);
  // const [getData, setDate] = useState(new Date());
  // console.log(weather.data);

  useEffect(() => {
    const getData = async () => {
      try {
        const response = await axios.get(
          'https://api.openweathermap.org/data/2.5/weather?q=Busan&appid=fa8f595a007aaa4d48ab5eb6ce037a33'
        );

        console.log(response);
        setWeather([response.data]);
        // let date = new Date(response.data.sys.sunset * 1000);
        // setDate(date.toLocaleString());
        // console.log(weather);
      } catch (error) {
        console.log(error);
      }
    };
    getData(); //함수 호출
  }, []);
  return (
    <div>
      {weather.map((weather) => (
        // console.log(weather);
        // console.log(weather.weather[0].main);
        // console.log(weather.weather[0].description);
        // console.log(weather.wind.speed);
        // console.log(weather.sys.sunset);
        // <div>{weather.data}</div>

        <div className="cont">
          <div>
            <span className="title"> {weather.name} </span>
            <p className="weather"> 날씨 : {weather.weather[0].main}</p>
            <p className="wea"> 날씨 설명 : {weather.weather[0].description}</p>
            <p className="wind"> 풍속 : {weather.wind.speed} </p>
            <p className="sunset"> 일몰 시간 : {weather.sys.sunset}</p>
          </div>
        </div>
      ))}
    </div>
  );
}

export default App;
