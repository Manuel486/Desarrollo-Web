import { usContext } from "../../src/base-pruebas/base-pruebas/06-deses-obj";



describe('Pruebas en 06-funciones',()=> {
  test('usContext debe de retornar un objeto', () => {
    const testUser = {
      nombreClave: '1234',
      anios: 21,
      latlng: {
        lat : 14.1232,
        lng : -12.3232
      }
    };

    const user = usContext({clave:'1234',edad:21});

    expect ( testUser ).toStrictEqual( user );

  });
})