// Arreglos en JS
// const arreglo = new Array(100); // con 100 posiciones, pero no es un candado que evita que se pueda crear mas

const arreglo = [1, 2, 3, 4];
// Recomendado no usar push porque estas alterando el objeto
// arreglo.push(1);
// arreglo.push(2);
// arreglo.push(3);
// arreglo.push(4);

let arreglo2 = [...arreglo, 5];

// Map crea un nuevo arreglo
let arreglo3 = arreglo2.map(function (numero) {
  return numero * 2;
});

console.log(arreglo);
console.log(arreglo2);
console.log(arreglo3);
