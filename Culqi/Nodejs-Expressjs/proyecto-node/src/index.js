// Antigua forma - Legacy
// const { getTitle, getAuthor } = require("./functions");
// const { curso } = require("./objects");

// Nueva forma desde ES6
// Para que funciona debo ir al package.json y poner el type:module
// Tambien modificar la forma de exportar
// import { getTitle, getAuthor } from "./functions.js";
// import { curso } from "./objects.js";

// const { nombre, autor } = curso;

// console.log(getTitle());
// console.log(getAuthor("Sergio Code"));

// console.log(process); // Informa del proceso de node

// -----------------------

import { config } from "dotenv";
import env from "env-var";

config(); // Hace que se ejecute una función que agarra las variables de entorno
const PORT = env.get("PORT").required().asPortNumber();

console.log(PORT);

console.log(process.env.PORT);
