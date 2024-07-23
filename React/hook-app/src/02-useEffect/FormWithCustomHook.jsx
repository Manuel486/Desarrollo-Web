import React, { useEffect, useState } from 'react'
import { useForm } from '../hooks/useForm';

export const FormWithCustomHook = () => {

  // NUEVA FORMA
  const { username, email, password, formState, onInputChange, onResetForm } = useForm({
      username: '',
      email: '',
      password: ''
  });

  // const { username, email, password } = formState;

  // ANTIGUA FORMA
  // const [formState, setFormState] = useState({
  //   username: '',
  //   email: '',
  //   password: ''
  // });

  // const { username, email, password } = formState;

  // const onInputChange = ({ target }) => {
  //   const { name, value } = target;
  //   setFormState({
  //     ...formState,
  //     [ name ] : value
  //   })
  // }

  useEffect( () => {
    // console.log('useEffect')
  }, []);

  useEffect( () => {
    // console.log('FormState changed')
  }, [ formState ]);

  useEffect( () => {
    // console.log('Email changes')
  }, [ email ]);

  return (
    <>
      <h1>Formulario con custom hook</h1>
      <hr />
      <input 
        type="text" 
        className='form-control' 
        placeholder='Username' 
        name='username' 
        value={ username } 
        onChange={ onInputChange }      
      />
      <input 
        type="email" 
        className='form-control mt-2' 
        placeholder='manuel@google.com' 
        name='email' 
        value={ email } 
          onChange={ onInputChange }
      />
      <input 
        type="password" 
        className='form-control mt-2' 
        placeholder='Contraseña' 
        name='password' 
        value={ password } 
          onChange={ onInputChange }
      />

      <button onClick={ onResetForm } className='btn btn-primary mt-2'>Borrar</button>

    </>
  )
}
