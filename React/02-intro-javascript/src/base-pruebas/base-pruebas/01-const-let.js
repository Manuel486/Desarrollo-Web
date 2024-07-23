// Variables y constantes

const nombre = "Manuel";
let apellido = "Chunga";

let valorDado = 5;
valorDado = 4;

console.log(nombre, apellido, valorDado);

if (true) {
  // Esta variable solo va a existir dentro de este scope
  const nombre = "Peter";
  let valorDado = 6;

  console.log(nombre, valorDado);
}

console.log(valorDado);
