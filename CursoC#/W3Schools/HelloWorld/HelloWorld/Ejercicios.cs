using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloWorld
{
    internal class Ejercicios
    {
        public static void Main(String[] args)
        {
            multiploDeUnoYCinco();
        }

        // Ejercicio 1: Invertir numero de dos cifras
        static void invertirCifras()
        {
            Console.Write("Ingrese el número de dos cifras: ");
            String numeroString = Console.ReadLine();
            Console.WriteLine(numeroString.Reverse().ToArray().ToString());
        }

        // Ejercicio 2: Dibujar triangulo
        static void dibujarTriangulo()
        {
            int numero = Convert.ToInt32(Console.ReadLine());

            int ancho = Convert.ToInt32(Console.ReadLine());

            for(int i=ancho;i>0;i--)
            {
                for(int j = i; j > 0; j--)
                {
                   Console.Write(numero);
                }
                Console.WriteLine();
            }
        }

        // Ejercicio 3: Dibujar triangulo nordest
        static void nordeste()
        {
            int ancho = Convert.ToInt32(Console.ReadLine());

            for (int i = ancho; i > 0; i--)
            {
                for(int k=ancho-i;k>0; k--)
                {
                    Console.Write(' ');
                }

                for (int j = i; j > 0; j--)
                {
                    Console.Write('*');
                }

                Console.WriteLine();
            }
        }

        // Ejercicio 4: Texto alineado a la derecha
        static void textoAlineadoAlaDerecha()
        {
            string text = Console.ReadLine();

            int j = 1;
            for (int i = text.Length - 1; i >= 0; i--)
            {
                Console.WriteLine(text.Substring(i, j));
                j++;
            }
        }

        // Ejercicio 5: Multiplo de 3 y 5 del 1 al 500
        static void multiploDeUnoYCinco()
        {
            for(int i = 1; i <= 500; i++)
            {
                if( i%15==0 )
                {
                    Console.Write(i);
                    Console.Write(' ');
                }
            }
        }
    }

    
}
