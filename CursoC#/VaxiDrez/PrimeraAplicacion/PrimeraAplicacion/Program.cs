using System; // estamos usando el namespace System, que engloba varias clases como Console

namespace PrimeraAplicacion
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Hola mundo"); // Este mensaje se imprime en la consola
            int edad = 35;
            edad++;
            //Console.WriteLine("Tu edad es " + edad + " años");
            Console.WriteLine($"Tu edad {edad} años");

            byte numero = 30;
            //numero = numero + 10; // Error a la asignacion
            numero += 10; // ahora es int
            Console.WriteLine(numero);

            // Asignaciones multiples
            int numero1;
            int numero2;
            int numero3;

            numero1 = numero2 = numero3 = 27;

            Console.WriteLine(numero2);


            // Declaracion implicita de variables
            // Las variables de tipo implicito se debe inicializar
            var edad1 = 21; // interpreta el valor como tipo entero
            //edad1 = 21.5; // error porque estamos tratando de convertir int a double
            Console.WriteLine(edad1);


            // Conversiones implicitas y explicitas
            // Conversion implicita
            double numero4 = 10; // conviertiendo un tipo int a double
            Console.WriteLine(numero4);

            // Conversion explicita
            int valor = (int) 10.0; // convirtiendo double a int
            Console.WriteLine(valor);

            // Perdemos informacion en la conversion explicita
            int miVariable = (int)20.5;
            Console.WriteLine(miVariable);


            // Conversiones de texto a numero
            Console.WriteLine("Ingre el primer valor ");
            int valor1 =  int.Parse(Console.ReadLine()); // Se queda a la espera que el usuario ingre un valor

            Console.WriteLine("Ingre el segundo valor ");
            int valor2 = int.Parse(Console.ReadLine());

            Console.WriteLine($"El valor de la multiplicación es : {valor1*valor2}");

            // Constantes
            const int NUMERO_CONSTANTE = 5;

            


            // Metodos 
            Console.WriteLine("La suma es : "+ sumarValores(4, 5));

            // Metodos de expresión corporal
            Console.WriteLine("La suma con un metodo corto es : "+sumarValoresVersionCorta(4, 5));

            // Excepciones


        }

        static int sumarValores(int valor1,int valor2)
        {
            // Console.WriteLine("El valor de la suma es : " + (valor1 + valor2));
            return valor1+valor2;
        }

        static int sumarValoresVersionCorta(int valor1, int valor2) => valor1 + valor2;

        void adivinarValor()
        {
            Random valor = new Random();
            int aleatorio = valor.Next(0, 100);
            int miValor = 101;
            int intentos = 0;
            Console.WriteLine("Introduce valores entre 0 y 100");

            while(aleatorio != miValor)
            {
                intentos++;

            }
        }


    }
}
