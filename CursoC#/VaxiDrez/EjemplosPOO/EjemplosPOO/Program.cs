using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjemplosPOO
{
    internal class Program
    {
        static void Main(string[] args)
        {

            // Circulo
            Circulo circulo = new Circulo();
            Console.WriteLine("El área del circulo es : " + circulo.calcularArea(4));

            // Auto
            Auto auto1 = new Auto();
            Console.WriteLine(auto1.Llantas);

            Console.ReadKey();
        }
    }

    class Circulo
    {
        double pi = 3.1416; // Una propiedad

        public double calcularArea(int radio)
        {
            return pi * radio * radio; //Método de clase
        }
    }

    class Auto
    {
        private int llantas;
        private double largo;
        private double ancho;
        private bool climatizador;
        private string tapiceria;

        public Auto()
        {
            llantas = 4;
            largo = 2300.5;
            ancho = 0.900;
        }

        public int Llantas
        {
            get { return llantas; }
            set { llantas = value; }
        }


    }
}
