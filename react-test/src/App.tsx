import React from 'react';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Books from './view';

function App() {
  return (
    <>
      <Routes>
        <Route path='/' element={<Books/>}/>
      </Routes>
    </>
  );
}

export default App;
