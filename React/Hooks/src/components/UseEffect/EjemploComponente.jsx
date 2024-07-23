import React, { useState, useEffect } from "react";

const EjemploComponente = () => {
  const [userData, setUserData] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchUserData = async () => {
      try {
        // Simulamos una llamada a una API con JSONPlaceholder
        const response = await fetch(
          "https://jsonplaceholder.typicode.com/users"
        );
        const data = await response.json();

        // Simulamos un retraso para mostrar el efecto de carga
        await new Promise((resolve) => setTimeout(resolve, 1000));

        setUserData(data);
        setLoading(false);
      } catch (error) {
        console.error("Error al obtener datos:", error);
        setLoading(false);
      }
    };

    fetchUserData();

    return () => {
      // Operaciones de limpieza si es necesario
    };
  }, []); // Dependencia vacía para ejecutar solo una vez al montar

  return (
    <div>
      <h1>Detalles del Usuario</h1>
      {loading ? (
        <p>Cargando...</p>
      ) : (
        <div>
          <pre>{JSON.stringify(userData, null, 2)}</pre>
        </div>
      )}
    </div>
  );
};

export default EjemploComponente;
