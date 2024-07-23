const datos = [{
  id: 1,
  title: 'Iron Man',
  year: 2008
}, {
  id: 2,
  title: 'Spiderman: Homecoming',
  year: 2017
},{
  id: 3,
  title: 'Avengers: Endgame',
  year: 2019
}]

// Promesas --> ejecuta un trozo de código y cuando este listo se devuelve
// tiempo de asincronia

const getDatos = () => {
  return new Promise((resolver, reject) => {
    setTimeout(() => {
      resolver(datos);
    },1500)
  });
}

// getDatos().then((datos) => console.log(datos) );

async function fetchingData () {
  try {
    const datosFetched = await getDatos(); // espera a tener esos datos
    console.log(datosFetched);
  } catch (err) {
    console.log(err);
  }
}

fetchingData();
