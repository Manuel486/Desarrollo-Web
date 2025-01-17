import { getHeroeById, getHeroesByOwner } from "../../src/base-pruebas/base-pruebas/08-imp-exp";

describe('Pruebas en 08-imp-exp',()=> {
  test('getHeroeById debe retornar un heroe por ID', () => {
    const id = 1;
    const hero = getHeroeById( id );
    expect( hero ).toEqual({ id: 1, name: 'Batman', owner: 'DC' })
  });

  test('getHeroeById debe retornar undefined si no existe', () => {
    const id = 100;
    const hero = getHeroeById( id );
    expect(hero).toBeFalsy();
  });

  // Tarea:
  // Debe de retornar un arreglo con los héroes de DC
  // lenght === 3
  // toEqual al arreglo filtrado

  // debe de retornar un arreglo con los héroes de Marvel
  // length === 2
  

  test('getHeroesByOwner debe retornar un arreglo con los héroes de DC', () => {
     const owner = 'DC';
     const heroes = getHeroesByOwner(owner);

     // Forma no tan eficiente
     expect(heroes.length).toBe(3);
     expect(heroes).toEqual([
      {id:1,name:'Batman',owner:'DC'},
      {id:3,name:'Superman',owner:'DC'},
      {id:4,name:'Flash',owner:'DC'}
     ]);
     
     // Forma correcta
     expect(heroes).toEqual(heroes.filter((heroe)=>heroe.owner='DC'));
  });

  test('getHeroesByOwner debe retornar un arreglo con los héroes de Marvel', () => {
    const owner = 'Marvel';
    const heroes = getHeroesByOwner(owner);

    expect(heroes.length).toBe(2);
    expect(heroes).toEqual(heroes.filter((heroe)=>heroe.owner='Marvel'));
  });
})

// export const getHeroesByOwner = ( owner ) => heroes.filter( (heroe) => heroe.owner === owner );