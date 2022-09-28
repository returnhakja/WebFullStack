import './App.css';
import { useRef, useState } from 'react';
import Image from './Image';

function App() {
  // input 제어를 위한 useRef
  const imgRef = useRef(null);
  const [imgList, setImgList] = useState([]);

  console.log(imgList);

  return (
    <div className="container">
      <div className="main">
        <div
          className="add-btn"
          onClick={() => {
            imgRef.current.click();
          }}
        >
          +
        </div>
        <input
          className="file-upload-input"
          type="file"
          ref={imgRef}
          onChange={(event) => {
            // setImgList([...imgList, event.currentTarget.value]);
            // fakepath 문제가 발생
            // const value = event.currentTarget.value;
            // setImgList((previusValue) => {
            //   return [...previusValue, value];
            // });
            console.log(event.currentTarget.files[0]);
            const fileReader = new FileReader();

            const file = event.currentTarget.files[0];
            fileReader.readAsDataURL(file);
            fileReader.onloadend = (event) => {
              // console.log(e.target.result);
              setImgList((prev) => {
                return [...prev, event.target.result];
              });
            };
            //onchnge가 변해야 하는데 변하지 않기때문에 value값을 초기화 시켜주어야함
            event.target.value = '';
          }}
        />
        <div className="main-text">Choose Image</div>
        <div className="gallery">
          {imgList.map((img, idx) => {
            // 반복문을 할때는 key값이 필요
            // <div className="img-item" key={img + idx}>
            //   <img src={img} alt=""></img>
            // </div>
            return <Image key={img + idx} idx={idx} img={img}></Image>;
          })}
        </div>
      </div>
    </div>
  );
}

export default App;
