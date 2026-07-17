import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(5); // Starting at 5 based on the screenshot

  // The “Increase” button invokes multiple methods (updating state and alerting)[cite: 7]
  const handleIncrement = () => {
    setCount(count + 1);
    alert("Hello! Member1"); // Say Hello followed by a static message[cite: 7]
  };

  const handleDecrement = () => {
    setCount(count - 1);
  };

  // Function which takes “welcome” as an argument[cite: 7]
  const handleSayWelcome = (message) => {
    alert(message);
  };

  // Invokes synthetic event to display “I was clicked”[cite: 7]
  const handleSyntheticEvent = (event) => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      <h3>{count}</h3>
      
      <div style={{ marginBottom: '5px' }}>
        <button onClick={handleIncrement}>Increment</button>
      </div>
      
      <div style={{ marginBottom: '5px' }}>
        <button onClick={handleDecrement}>Decrement</button>
      </div>
      
      <div style={{ marginBottom: '5px' }}>
        <button onClick={() => handleSayWelcome('welcome')}>Say welcome</button>
      </div>
      
      <div style={{ marginBottom: '5px' }}>
        <button onClick={handleSyntheticEvent}>Click on me</button>
      </div>

      <CurrencyConvertor />
    </div>
  );
}

export default App;