import React from 'react';

function User({ user }) {
  return (
    <div>
      <p>{user.username}</p>
    </div>
  );
}

function LectureList({ users }) {
  return (
    <div>
      {users.map((user, index) => (
        <User user={user} key={index} />
      ))}
    </div>
  );
}

export default LectureList;
