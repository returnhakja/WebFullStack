// const getCategoryData = () =>
//   fetch('/categoryData.json').then((response) => console.log(response.json()));

const request = async (url) => {
  try {
    const response = await fetch(url); //가져올때까지 기다림?
    const data = response.json(); // 가져온 데이터를 json형태로 바꿔준다
    return data;
  } catch (error) {}
};

const getCategoryData = async () => {
  const data = await request('/categoryData.json'); //가져올때까지 기다림?
  return data;
};
const getnewsData = async () => {
  const data = await request('/newsData.json'); //가져올때까지 기다림?
  return data;
};

export default getCategoryData;
