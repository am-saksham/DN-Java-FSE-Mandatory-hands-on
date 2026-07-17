import React, { useState } from 'react';

// Displays when the user is logged in
function UserGreeting() {
  return <h1>Welcome back</h1>;
}

// Displays when the user is logged out
function GuestGreeting() {
  return <h1>Please sign up.</h1>;
}

// Conditionally returns the correct greeting based on props
function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

// Renders the Login button
function LoginButton(props) {
  return (
    <button onClick={props.onClick}> 
      Login 
    </button>
  );
}

// Renders the Logout button
function LogoutButton(props) {
  return (
    <button onClick={props.onClick}> 
      Logout 
    </button>
  );
}

// Main App Component
function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  // Element variables to hold the button component
  let button;
  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div style={{ textAlign: 'center', marginTop: '100px', fontFamily: 'sans-serif' }}>
      <Greeting isLoggedIn={isLoggedIn} />
      {button}
    </div>
  );
}

export default App;