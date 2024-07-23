import React, { useState } from "react";

export const useCounter = ({ valorInicial = 0 }) => {
  const [contador, setContador] = useState(valorInicial);

  const incrementar = () => {
    setContador(contador + 1);
  };

  const decrementar = () => {
    if (contador > 0) {
      setContador(contador - 1);
    }
  };

  const resetear = () => {
    setContador(valorInicial);
  };

  return {
    contador,
    incrementar,
    decrementar,
    resetear,
  };
};
