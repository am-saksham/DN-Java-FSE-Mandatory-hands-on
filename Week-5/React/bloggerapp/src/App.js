import React from 'react';
import './App.css';

// Exported array of book objects as required by the hint
export const books = [
  {id: 101, bname: 'Master React', price: 670},
  {id: 102, bname: 'Deep Dive into Angular 11', price: 800},
  {id: 103, bname: 'Mongo Essentials', price: 450}
];

const blogs = [
  {id: 1, title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!'},
  {id: 2, title: 'Installation', author: 'Schewzdenier', content: 'You can install React from npm.'}
];

const courses = [
  {id: 1, name: 'Angular', date: '4/5/2021'},
  {id: 2, name: 'React', date: '6/3/20201'} // Matches the typo in the source screenshot
];

// Extracted Component for Book Details using props and map()[cite: 9]
function BookDetails(props) {
  const bookdet = (
    <ul>
      {/* Conditional rendering: only map if books exist[cite: 9] */}
      {props.books && props.books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
          <br />
        </div>
      ))}
    </ul>
  );
  return bookdet;
}

function App() {
  // Element variable holding mapped blog components[cite: 9]
  const content = (
    <ul>
      {blogs.length > 0 && blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.content}</p>
          <br />
        </div>
      ))}
    </ul>
  );

  // Element variable holding mapped course components[cite: 9]
  const coursedet = (
    <ul>
      {courses.length > 0 ? courses.map((course) => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <h4>{course.date}</h4>
          <br />
        </div>
      )) : <p>No courses available.</p>} 
    </ul>
  );

  return (
    <div className="wrapper">
      <div className="mystyle1">
        <h2>Course Details</h2>
        {coursedet}
      </div>
      
      <div className="st2">
        <h2>Book Details</h2>
        {/* Passing the exported array as props to the extracted component */}
        <BookDetails books={books} />
      </div>
      
      <div className="v1">
        <h2>Blog Details</h2>
        {content}
      </div>
    </div>
  );
}

export default App;