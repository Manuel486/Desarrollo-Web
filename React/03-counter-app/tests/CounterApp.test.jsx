import { fireEvent, render, screen } from "@testing-library/react";
import { CounterApp } from "../src/CounterApp";

describe('Pruebas en CounterApp',()=>{
  const value = 10;

  test('debe de hacer math con el snapshot',()=>{
    const {container} = render(<CounterApp />);
    expect(container).toMatchSnapshot();
  })

  test('debe mostrar el valor inicial de 10 <CounterApp value={10}/>',()=> {
    render(<CounterApp value={ value }/>);
    expect( screen.getByText(value) ).toBeTruthy();
    // expect( screen.getByRole('heading', { level: 2}).innerHTML).toContain(value.toString());
  })

  test('debe de incrementar con el botón +1', () => {
    render(<CounterApp value={ value }/>);
    fireEvent.click( screen.getByText('+1'))
    // screen.debug();
    expect(screen.getByText('11')).toBeTruthy();
  })

  test('debe de incrementar con el botón -1', () => {
    render(<CounterApp value={ value }/>);
    fireEvent.click( screen.getByText('-1'))
    // screen.debug();
    expect(screen.getByText('9')).toBeTruthy();
  })

  test('debe de incrementar con el botón +1', () => {
    render(<CounterApp value={ value }/>);
    fireEvent.click( screen.getByText('+1'))
    // screen.debug();
    expect(screen.getByText('11')).toBeTruthy();
  })

  test('debe de resetear el valor', () => {
    render(<CounterApp value={ value }/>);
    fireEvent.click( screen.getByText('+1'))
    fireEvent.click( screen.getByText('+1'))
    fireEvent.click( screen.getByText('+1'))
    // fireEvent.click( screen.getByText('Reset'))
    fireEvent.click( screen.getByRole('button', {name: 'btn-reset'} ));
    // screen.debug();
    expect(screen.getByText(value.toString())).toBeTruthy();
  })
})