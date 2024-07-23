import React from "react";
import ReactDOM, { createRoot } from "react-dom/client";
import { HelloWorldApp } from "./HelloWorldApp";
import { FirstApp } from "./FirstApp";

import "./styles.css";
import { CounterApp } from "./CounterApp";

// Forma deprecada
// const saludo = <h1>Hola mundo</h1>;
// const root = createRoot(document.getElementById('root'));
// root.render(saludo);

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    {/* <HelloWorldApp /> */}
    {/* <FirstApp title="Hola, Soy Vegeta" /> */}
    <CounterApp value={20} />
  </React.StrictMode>
);
