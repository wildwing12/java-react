import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from "react";
import axios from "axios";

function App() {
  const [test,setTest] = useState();

  useEffect(async ()=>{
    const response = await axios.get(
        'http://localhost:8088/test'
    );
    console.log(response.data[0].MEM_ID);
    setTest(response.data[0].MEM_ID);

  },[]);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <h1>{test}</h1>
      </header>
    </div>
  );
}

export default App;
