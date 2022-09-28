import request from './request';

const getImages = async () => {
  const data = await request(
    'https://pixabay.com/api/?key=27684550-d7f1fee18c4f7dba9649d0419&q=sky'
  );
  return data;
};

export default getImages;
