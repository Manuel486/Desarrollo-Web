import { render, screen } from "@testing-library/react";
import { FirstApp } from "../src/FirstApp";

describe('Pruebas en <FistApp />', () => { 

  const title = 'Hola, Soy Goku';
  const subtitle = 'Hola, Soy un subtitulo';

  test('debe de hacer un match con el snapshot', () => {

    const { container } = render(<FirstApp title={ title }/>)
    expect( container ).toMatchSnapshot();
  });


  test('debe de mostrar el mensaje "Hola, Soy Goku', () => {

    //screen.debug(); //almacena el body , este va renderizando cada cosa que renderizo
    render(<FirstApp title={ title }/>)
    expect( screen.getByText(title) ).toBeTruthy();
    // expect( screen.getByText(title) ).not.toBeTruthy();
  })

  test('debe de mostrar el titulo en un h1', () => { 
    render(<FirstApp title={ title }/>);
    expect( screen.getByRole('heading', { level: 1 }).innerHTML).toContain( title );
   })


  test('debe de mostrar el subtitulo enviado por props',()=>{
    render(<FirstApp title={ title } subTitle={subtitle}/>)
    //screen.debug();
    expect(screen.getAllByText(subtitle).length).toBe(2);
  })

 });