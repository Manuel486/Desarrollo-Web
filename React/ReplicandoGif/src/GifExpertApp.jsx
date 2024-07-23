import { useState } from 'react'
import { AddCategory } from './components/AddCategory';
import { GifGrid } from './components/GifGrid';
import { Container } from 'react-bootstrap';

export const GifExpertApp = () => {
  
  const [categories, setcategories] = useState([]);
  
  const onAddCategory = (value) => {

    if(categories.includes(value)) return;

    setcategories([value,...categories]);
  }

  return (
    <Container>
      <h1 className='text-center'>Gif</h1>
      <AddCategory onAddCategory= { value => onAddCategory(value)} />
      {
        categories.map( category => (
          <GifGrid key={ category } category={ category } />
        ))
      }
    </Container>
  )
}
