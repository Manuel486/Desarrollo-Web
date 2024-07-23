const { findPositions } = require("../src/combinaciones");

describe("findPositions", () => {
  test("encuentra las posiciones de las combinaciones únicas de palabras", () => {
    const s = "barfoofoobarthefoobarman";
    const words = ["bar", "foo", "the"];
    const positions = findPositions(s, words);
    expect(positions).toEqual([9, 6, 12]);
  });

  // Agrega más pruebas aquí según sea necesario
});
