import { getImagen } from "../../src/base-pruebas/base-pruebas/11-async-await";

describe('Pruebas en 11-async-await',()=> {
  test('getImagen debe de retornar un URL de la imagen', async() => {
    const url = await getImagen();
    // console.log(url);

    expect( typeof url ).toBe('string');
  });

  test('getImagen debe de retornar un error si no tenemos apiKey', async() => {
    // Debo comentar el apiKey en mi otro código
    const resp = await getImagen();
    // console.log(resp);

    expect( resp ).toBe('No se encontro la imagen');
  });
})
