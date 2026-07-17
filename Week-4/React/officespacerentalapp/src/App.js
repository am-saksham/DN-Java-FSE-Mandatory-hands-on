import React from 'react';
import './App.css';

function App() {
  // Create an element to display the heading of the page
  const element = "Office Space"; 
  
  // Placeholder image URL for 'sr'
  const sr = "https://images.unsplash.com/photo-1497366216548-37526070297c?auto=format&fit=crop&w=300&q=80"; 
  
  // Attribute to display the image of the office space[cite: 6]
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />; 
  
  // Create an object of office to display details like Name, Rent, and Address[cite: 6]
  const ItemName = { Name: "DBS", Rent: 50000, Address: 'Chennai' }; 

  // Display the color of the Rent in Red if it’s below 60000 and in Green if it’s above 60000[cite: 6]
  let colors = []; 
  if (ItemName.Rent <= 60000) { 
      colors.push('textRed'); 
  } else { 
      colors.push('textGreen'); 
  }

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      <h1>{element}, at Affordable Range</h1>
      {jsxatt}
      
      <h1>Name: {ItemName.Name}</h1>
      {/* Applying the dynamic color class */}
      <h3 className={colors[0]}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;