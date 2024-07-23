import { useState } from 'react'
import { Form } from 'react-bootstrap';

export const AddCategory = ({ onAddCategory }) => {

  const [inputValue, setInputValue] = useState('');


  const onSubmit = (e) => {
    e.preventDefault();
    if( inputValue.trim().length <= 1) return;
    onAddCategory(inputValue.trim());
    setInputValue('');
  }

  const onInputChange = ({target}) => {
    setInputValue(target.value);
  }

  return (
    <>
      <Form onSubmit={ onSubmit }>
        <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
          <Form.Control type="text" value={ inputValue } placeholder='Ingresa un texto' onChange={ onInputChange }/>
        </Form.Group>
      </Form>
    </>
  )
}
