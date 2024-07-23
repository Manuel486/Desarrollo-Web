/**
 * Encuentra las posiciones de todas las combinaciones únicas de palabras en una cadena.
 * @param {string} s - La cadena en la que buscar las combinaciones.
 * @param {string[]} words - Un arreglo de palabras.
 * @returns {number[]} - Un arreglo con las posiciones de las combinaciones encontradas.
 */
const findPositions = (s, words) => {
  const combinaciones = combineWords(words);
  console.log(combinaciones);
  const positions = [];
  combinaciones.forEach((combinacion) => {
    let index = -1;
    while ((index = s.indexOf(combinacion, index + 1)) !== -1) {
      positions.push(index);
    }
  });

  return positions.sort((a, b) => a - b);
};

/**
 * Genera todas las combinaciones únicas de palabras.
 * @param {string[]} words - Un arreglo de palabras.
 * @returns {string[]} - Un arreglo con todas las combinaciones únicas de palabras.
 */
const combineWords = (words) => {
  const combinaciones = [];

  // Función recursiva para generar combinaciones
  const generateCombinations = (prefix, remainingWords) => {
    if (remainingWords.length === 0) {
      combinaciones.push(prefix);
    } else {
      for (let i = 0; i < remainingWords.length; i++) {
        generateCombinations(
          prefix + remainingWords[i],
          remainingWords.slice(0, i).concat(remainingWords.slice(i + 1))
        );
      }
    }
  };

  generateCombinations("", words);

  return combinaciones;
};

module.exports = {
  findPositions,
};

// let s = "barfoofoobarthefoobarman";
// let words = ["bar", "foo", "the"];
// const positions = findPositions(s, words);
// console.log("Posiciones de combinaciones:", positions);
