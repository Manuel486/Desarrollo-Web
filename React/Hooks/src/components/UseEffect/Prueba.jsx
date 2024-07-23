import React, { useEffect } from "react";

const Prueba = () => {
  // Este efecto se ejecuta cuando el componente se monta
  useEffect(() => {
    console.log("Componente montado");

    // Función de limpieza que se ejecuta cuando el componente se desmonta
    return () => {
      console.log("Componente desmontado");
    };
  }, []); // El array de dependencias está vacío, por lo que el efecto se ejecuta solo una vez al montar el componente

  return <div>Contenido del componente</div>;
};

export default Prueba;
