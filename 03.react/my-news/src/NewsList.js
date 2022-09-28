import React, { useEffect, useState } from 'react';
import './NewsItem';
import styled from 'styled-components';
import NewsItem from './NewsItem';
import axios from 'axios';

const NewsItemBlock = styled.div`
  box-sizing: border-box;
  padding-bottom: 3rem;
  width: 768px;
  margin: 0 auto;
  margin-top: 2rem;
  @media screen and (max-width: 768px) {
    width: 100%;
    padding-left: 1rem;
    padding-right: 1rem;
  }
`;

// const semple = {
//   title: '제목',
//   description: '내용',
//   url: 'https://www.google.com',
//   urlToImage: 'https://via.placeholder.com/160',
// };
function NewsList({ category }) {
  //여기서 axios
  const [articles, setArticles] = useState([]);

  //   useEffect(() => {
  //     const getData = async () => {
  //       try {
  //         const response = await axios.get(
  //           `https://newsapi.org/v2/top-headlines?country=kr&apiKey=f2d43a1e4c3c46bd8f95574937bbb881&category=${category}`
  //         );
  //         setArticles(response.data.articles);
  //         // console.log(response.data.articles);
  //       } catch (error) {
  //         console.log(error);
  //       }
  //     };
  //     getData(); //함수 호출
  //   }, [category]);
  return (
    <NewsItemBlock>
      {/* <NewsItem article={semple}></NewsItem>
      <NewsItem article={semple}></NewsItem>
    <NewsItem article={semple}></NewsItem> */}
      {articles.map((article) => (
        <NewsItem key={article.url} article={article} /> //각 뉴스들이 key값을 가지도록 함
      ))}
    </NewsItemBlock>
  );
}

export default NewsList;
