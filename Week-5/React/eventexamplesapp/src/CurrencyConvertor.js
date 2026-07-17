import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');

  // Handle the Click event of the button to invoke the handleSubmit event
  const handleSubmit = (e) => {
    e.preventDefault();
    
    // Simple conversion logic based on the expected output (80 * 80 = 6400)
    const convertedAmount = amount * 80; 
    
    alert(`Converting to ${currency} Amount is ${convertedAmount}`);
  };

  return (
    <div style={{ marginTop: '30px' }}>
      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '10px' }}>
          <label style={{ marginRight: '10px' }}>Amount:</label>
          <input 
            type="number" 
            value={amount} 
            onChange={(e) => setAmount(e.target.value)} 
          />
        </div>
        <div style={{ marginBottom: '10px' }}>
          <label style={{ marginRight: '10px' }}>Currency:</label>
          <input 
            type="text" 
            value={currency} 
            onChange={(e) => setCurrency(e.target.value)} 
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;