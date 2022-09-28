import './App.css';
// import axios from 'axios';
import React, { useRef, useState } from 'react';
import Counter from './Counter';
import InputSample from './InputSample';
import UserList from './UserList';
import CreateUser from './CreateUser';

function App() {
  const [inputs, setInputs] = useState({
    name: '',
    email: '',
  });
  const { username, email } = inputs;

  const onChange = (e) => {
    const { value, name } = e.target;
    setInputs({
      ...inputs,
      [name]: value,
    });
  };

  const [users, setUsers] = useState([
    {
      id: 1,
      username: 'velopert',
      email: 'public.velopert@gmail.com',
    },
    {
      id: 2,
      username: 'tester',
      email: 'tester@example.com',
    },
  ]);

  const nextId = useRef(4);
  const onCreate = () => {
    const user = {
      id: nextId.current,
      username,
      email,
    };
    setUsers([...users, user]);

    setInputs({
      username: '',
      email: '',
    });
    nextId.current += 1;
  };
  const onRemove = (id) => {
    setUsers(users.filter((user) => user.id !== id));
  };
  return (
    <div>
      {/* <InputSample /> */}
      {/* // <Counter></Counter>; */}
      {/* //   <UserList></UserList> */}
      <CreateUser
        username={username}
        email={email}
        onChange={onChange}
        onCreate={onCreate}
      />
      <UserList users={users} onRemove={onRemove} />{' '}
    </div>
  );
}

export default App;
