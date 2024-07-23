// Variables y constantes

const nombre = "Manuel";
let apellido = "Chunga";

// const nombreCompleto = nombre + ' ' + apellido;
// backtick -> ``
const nombreCompleto = `${nombre} ${apellido} ${1 + 1}`;

console.log(nombreCompleto);

function getSaludo(nombre = "usuario") {
  return `Hola ` + nombre;
}

console.log(`Este es un texto: ${getSaludo("Piero")}`);
