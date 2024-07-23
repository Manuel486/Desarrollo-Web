const persona = {
  nombre: "Tony",
  apellido: "Stark",
  edad: 45,
  direccion: {
    ciudad: "New York",
    zip: 55321321,
    lat: 14.3232,
    lng: 34.9233321,
  },
};

// Creando un nuevo objeto que tiene una propiedad llamada persona
// { persona: persona} que es lo mismo que decir { persona }
console.log({ persona });

// No estamos copiando el valor, estamos copiando la referencia del espacio en memoria
// const persona2 = persona;

// Creamos una copia de persona y se lo asignamos a persona2
const persona2 = { ...persona };
persona2.nombre = "Peter";

console.log(persona2);
console.log(persona);
