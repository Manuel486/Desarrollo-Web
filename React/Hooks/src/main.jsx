import React from "react";
import ReactDOM from "react-dom/client";
import AppTask from "./components/Task/AppTask";
import EjemploComponente from "./components/UseEffect/EjemploComponente";
import { StoreApi } from "./components/UseEffect/StoreApi";

import Prueba from "./components/UseEffect/Prueba";
import { CounterApp } from "./components/Contador/CounterApp";

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    <CounterApp />
  </React.StrictMode>
);
