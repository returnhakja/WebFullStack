// https://pixabay.com/api/?key=27684550-d7f1fee18c4f7dba9649d0419&q=sky

const request = async (url) => {
  try {
    const response = await fetch(url);
    const data = await response.json();
    return data;
  } catch (error) {
    console.log(error);
  }
};

export default request;
