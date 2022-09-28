import './App.css';
import { useState, useRef, useEffect } from 'react';
import styled from 'styled-components';

const LectureList = styled.ul`
  padding-left: 0px;
`;

const Lecture = styled.li`
  width: 100px;
  background: palevioletred;
  color: white;
  font-size: 1.125rem;
  list-style-type: none;
  text-align: center;
  border-radius: 5px;
  padding: 0.25rem;
  margin: 5px;
`;

const App = () => {
  const inputRef = useRef();
  useEffect(() => {
    inputRef.current.focus();
  });

  const [lectures, setLectures] = useState(['HTML', 'CSS', 'JavaScript']);
  const [newLecture, setNewLecture] = useState('');

  const handleInputLecture = (event) => {
    setNewLecture(event.target.value);
  };

  const handleUpdateLecture = () => {
    setLectures((prev) => {
      if (newLecture === '') {
        return lectures;
      } else return [...prev, newLecture];
    });
    inputRef.current.focus();
    setNewLecture('');
  };

  return (
    <div className="App">
      <div>
        <input
          value={newLecture}
          ref={inputRef}
          type="text"
          placeholder="배운과목을 입력하세요."
          onChange={handleInputLecture}
        ></input>

        <button onClick={handleUpdateLecture}>추가</button>
      </div>
      <LectureList>
        {lectures.map((lecture, idx) => (
          <Lecture key={`${lecture}` + idx}>{lecture}</Lecture>
        ))}
      </LectureList>
    </div>
  );
};

export default App;
