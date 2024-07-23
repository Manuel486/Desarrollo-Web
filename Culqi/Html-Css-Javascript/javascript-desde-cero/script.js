// Ordenamiento Burbuja
function ordenarBurbuja(arr) {
  const nuevoArray = [...arr];
  for (let i = 0; i < nuevoArray.length; i++) {
    for (let j = 0; j < nuevoArray.length - 1 - i; j++) {
      if (nuevoArray[j] > nuevoArray[j + 1]) {
        let auxiliar = nuevoArray[j];
        nuevoArray[j] = nuevoArray[j + 1];
        nuevoArray[j + 1] = auxiliar;
      }
    }
  }
  return nuevoArray;
}

console.log(ordenarBurbuja([4, 2, 3, 1, 8, 6, 4]));

// Ordenamiento sort
function ordenarSort(arr) {
  const nuevoArray = [...arr];
  if (nuevoArray.length <= 1) {
    return nuevoArray;
  }

  const pivot = nuevoArray[nuevoArray.length - 1];
  const derecha = [];
  const izquierda = [];

  for (let valor of nuevoArray.slice(0, nuevoArray.length - 1)) {
    valor > pivot ? derecha.push(valor) : izquierda.push(valor);
  }

  return [...ordenarSort(izquierda), pivot, ...ordenarSort(derecha)];
}

console.log(ordenarSort([4, 2, 3, 1, 8, 6, 4]));

// Crea un string que reciba una frase como string y devuelva la palabra más larga

function palabraMasLarga(str) {
  const array = str.split(" ");
  const nuevoArray = array.sort((a, b) => a.length - b.length);
  return nuevoArray[nuevoArray.length - 1];
}

console.log(palabraMasLarga("Erase una vez que se era") === "Erase");

// Crea un función que reciba un string y lo devuelva con todas las con su primera letra en mayuscula

function ponPrimeraMayuscula(str) {
  const array = str.split(" ");
  const nuevoArray = array.map((valor) =>
    valor[0].toUpperCase().concat(valor.substring(1))
  );
  return nuevoArray.join(" ");
}

console.log(
  ponPrimeraMayuscula(
    "En un lugar de la Mancha de cuyo nombre no quiero acordarme"
  ) === "En Un Lugar De La Mancha De Cuyo Nombre No Quiero Acordarme"
);

// 9. Vamos a emular una

function infectados(s) {
  let numeroIfectados;
}

infectados("01000000X000X011X0X");
