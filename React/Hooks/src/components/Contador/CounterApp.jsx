import React from "react";
import { useCounter } from "./UseCounter";

export const CounterApp = () => {
  const { contador, incrementar, decrementar, resetear } = useCounter(0);

  return (
    <>
      <h1>Contador</h1>
      <span>Valor : {contador}</span>
      <button onClick={incrementar}>Incrementar</button>
      <button onClickCapture={resetear}>Resetear</button>
      <button onClick={decrementar}>Decrementar</button>
    </>
  );
};
