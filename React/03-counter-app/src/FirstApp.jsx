// import { Fragment } from "react"
// es lo mismo que usar <></>
// es un agrupar de otros html

// No podemos mandar el objeto
const newMessage = {
  message: "Hola mundo",
  title: "Manuel",
};

// las funciones pueden ir dentro del FirstApp
// const getResult = (a,b) => {
//   return  a+b;
// }

import PropTypes from "prop-types";

export const FirstApp = ({ title, subTitle, name }) => {
  return (
    // Uso de fragmentos
    <>
      {/* <h1>{ getResult(1,2) }</h1> */}
      <h1 data-testid="test-title">{title}</h1>

      {/* Hacemos esto porque no se puede enviar un objeto a un componente */}
      {/* <code>{ JSON.stringify(newMessage) }</code>  */}

      <p>{subTitle}</p>
      <p>{subTitle}</p>
      <p>{name}</p>
    </>
  );
};

// Si trabajo en vite necesito instalar el propTypes
// npm install prop-types

FirstApp.propTypes = {
  title: PropTypes.string.isRequired,
  subTitle: PropTypes.string.isRequired,
};

FirstApp.defaultProps = {
  title: "No hay titulo",
  subTitle: "",
  name: "Manuel Chunga",
};
