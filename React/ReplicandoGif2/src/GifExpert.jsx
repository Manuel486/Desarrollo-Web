import { useState } from 'react'
import { GifGrid } from './components/GifGrid';
import { GifAdd } from './components/GifAdd';
import { Container } from '@mui/material';
import Swal from 'sweetalert2';

export const GifExpert = () => {

  const [categories, setCategories] = useState([]);
 
  const addCategory = (value) => {
    if( categories.includes(value) ){
      Swal.fire({
        icon: 'warning',
        title: 'Repetido',
        text: `La palabra ${value} ya esta incluida`,
      })
      
    }
    setCategories([value,...categories]);
  }

  return (
    <>
      <Container maxWidth="xl">
      <h1 style={{ textAlign: 'center' }}>GIF</h1>
        <GifAdd addCategory = { value => addCategory(value) } />
        {
          categories.map( (category) => (
            <GifGrid key={ category } category = { category } />
          ))
        }
      </Container>
    </>
  )
}
