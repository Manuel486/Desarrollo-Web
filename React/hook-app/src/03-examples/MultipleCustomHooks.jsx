import { useFetch,useCounter } from '../hooks';
import { LoadingQuote, Quote } from './';


export const MultipleCustomHooks = () => {

  const { counter, increment } = useCounter(1);

  const { data, isLoading, hasError } = useFetch(`https://api.breakingbadquotes.xyz/v1/quotes/${counter}`);

  const { author, quote } = !!data && data[0];

  
  // data si tengo undefined 
  // (!data) => true
  // (!!data) => false

  // const { author, quote } = false 
  // author = undefined , quote = undefined

  // Ambos casos me convienen porque de lo contrario me daria un error.

  // -------------------------------------------------------------
  // if ( isLoading ) {
  //   return (
  //     <h1>Cargando...</h1>
  //   )
  // }

  // No debo poner hooks aqui abajo 
  // Los hooks no deben ser renderizados de manera condicional

  return (
    <>
      <h1>BreakingBad Quotes</h1>
      <hr />

      {
        isLoading 
          ? <LoadingQuote />  
          : <Quote author = { author } quote = { quote }/>
      }

      <button 
        className='btn btn-primary' 
        disabled= { isLoading }
        onClick={ () => increment(1) }>
        Next quote
      </button>
    </>
  )
}
