// Funciones en JS

// Si lo hacemos asi podemos cometer de crear una variable con el mismo nombre de la funcion
const saludar = function (nombre) {
  return `Hola, ${nombre}`;
};

// saludar = 30;

const saludar2 = (nombre) => {
  return `Hola2, ${nombre}`;
};

const saludar3 = (nombre) => `Hola3, ${nombre}`;

console.log(saludar());
console.log(saludar2());
console.log(saludar3());

const getUser = () => ({
  uid: "ABC123",
  username: "El",
});

console.log(getUser());

// Tarea
// 1. Transforma a
const getUsuarioActivo = nombre({
  uid: "ABC657",
  username: nombre,
});

const usuarioActivo = getUsuarioActivo("Manuel");
console.log(usuarioActivo);
