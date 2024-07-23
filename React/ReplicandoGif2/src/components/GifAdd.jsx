import { FormControl, InputAdornment, InputLabel, OutlinedInput } from '@mui/material';
import { useState } from 'react'

export const GifAdd = ({ addCategory }) => {
  const [category, setCategory] = useState('');
  const onSubmit = (e) => {
    e.preventDefault();
    addCategory(category);
    setCategory('');
  }

  const onChange = ({ target }) => {
    setCategory(target.value);
  }
  return (
    <form onSubmit={ onSubmit } >
      <FormControl fullWidth>
          <InputLabel htmlFor="outlined-adornment-amount">Ingrese el nombre del gif</InputLabel>
          <OutlinedInput
            id="outlined-adornment-amount"
            label="Ingrese el nombre del gif"
            value={ category } onChange={ onChange }
          />
          {/* <input type="text" placeholder='Ingrese el nombre del gif' value={ category } onChange={ onChange }/> */}
      </FormControl>
    </form>
     
    // <form >  
    //     <input type="text" placeholder='Ingrese el nombre del gif' value={ category } onChange={ onChange } />
    // </form>
  )
}
