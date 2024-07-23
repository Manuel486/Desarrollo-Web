using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicios
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // # 1
            // promedioNotas();

            // # 2
            // cajeroAutomatico();

            // # 3
            piramideDeNumeros();

        }

        // #1 : Promedio de notas
        static void promedioNotas()
        {
            Console.Write("Ingrese la cantidade alumnos : ");
            int n = Convert.ToInt32(Console.ReadLine());
            decimal[] promedios = new decimal[n];

            for (int i = 0; i < promedios.Length; i++)
            {
                Console.Write($"Ingre el promedio del alumno {i + 1} : ");
                promedios[i] = Convert.ToInt32(Console.ReadLine());
            }

            // Ordenando promedios de mayor a menor
            Array.Sort(promedios);

            Console.WriteLine("El alumno con el mayor promedio es : " + promedios[promedios.Length - 1]);
            Console.WriteLine("El alumno con el menor promedio es : " + promedios[0]);
        }

        static void cajeroAutomatico()
        {
            const int NIP = 3867;
            double saldo = 4000;
            int intentos = 3;
            bool bandera = false;
            List<double> movimientos = new List<double>();

            do
            {
                Console.Write("Ingrese el NIP : ");
                if (Convert.ToInt32(Console.ReadLine()) == NIP)
                {
                    bandera = true;
                }
                intentos--;
            } while (intentos>=1 && bandera==false);


            if (bandera)
            {
                int opcion;
                do
                {
                    Console.Clear();
                    Console.WriteLine("======== CAJERO AUTOMATICO ========");
                    Console.WriteLine("1.Consultar saldo");
                    Console.WriteLine("2.Retirar efectivo");
                    Console.WriteLine("3.Consultar movimientos");
                    Console.WriteLine("4.Salir");
                    Console.Write("Debe ingresar una opcion : ");
                    opcion = Convert.ToInt32(Console.ReadLine());
                    Console.Clear();
                    switch (opcion)
                    {
                        case 1: 
                            Console.WriteLine("Su saldo es :"+saldo);
                            break;
                        case 2:
                            Console.Write("Ingrese el monto que desea retirar : ");
                            double monto = Convert.ToDouble(Console.ReadLine());
                            if (saldo >= monto)
                            {
                                saldo -= monto;
                                movimientos.Add(monto);
                            }
                            else Console.WriteLine("No cuenta con el saldo suficiente.");
                                break;
                        case 3:
                            Console.WriteLine("Hisotiral de movimientos: ");
                            if (movimientos.Count() > 0)
                            {
                                for (int i = 0; i < movimientos.Count; i++)
                                {
                                    double movimiento = movimientos[i];
                                    Console.WriteLine($"Monto retirado: {movimiento} , Fecha: {DateTime.Now}");
                                }
                            }
                            else Console.WriteLine("No registra ningún movimiento");
                            break;
                        case 4: Console.WriteLine("Saliendo del sistema"); break;
                        default: Console.WriteLine("Ingrese una opción valida"); break;
                    }

                    Console.WriteLine("\nPresione cualquier tecla para regresar");
                    Console.ReadKey();


                } while (opcion != 4);
            } else
            {
                Console.WriteLine("Se acabaron los intentos");
            }

        }

        // # 3 : Pirámide de números
        static void piramideDeNumeros()
        {
            Console.Write("Ingrese la cantidad de filas de la pirámide (del 1 al 9): ");
            int filas = Convert.ToInt32(Console.ReadLine());

            for (int i = 1; i <= filas; i++)
            {
                // Imprimir espacios en blanco antes de los números
                Console.Write(new string(' ', filas - i));

                // Imprimir números ascendentes
                for (int j = 1; j <= i; j++)
                {
                    Console.Write(j);
                }

                // Imprimir números descendentes (sin repetir el último número)
                for (int j = i - 1; j >= 1; j--)
                {
                    Console.Write(j);
                }

                Console.WriteLine();
            }
        }

    }
}
