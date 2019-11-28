using System;

namespace Delegates
{
    public delegate int delegado(int [] x);
    class Program
    {
        static int suma;
        static int promedio;
        static int numMayor;
        public static int Suma(int[] arr) //SUMA
        {
            for (int i = 0; i < 5; i++)
            {
                suma += arr[i];
            }
            return suma;
        }
        public static int Promedio(int[] arr) //PROMEDIO
        {
            for (int i = 0; i < 5; i++)
            {
                promedio += arr[i];
            }
            promedio = promedio / 5;
            return promedio;
        }
        public static int NumMayor(int[] arr) //NÚMERO MAYOR
        {
            Array.Sort(arr);
            numMayor = arr[4];
            return numMayor;
        }
        public static int GetSuma()
        {
            return suma;
        }
        public static int GetPromedio()
        {
            return promedio;
        }
        public static int GetNumMayor()
        {
            return numMayor;
        }
        static void Main(string[] args)
        {
            delegado d1 = new delegado(Suma);
            delegado d2 = new delegado(Promedio);
            delegado d3 = new delegado(NumMayor);

            int[] edad = new int[5];
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine("Ingresa un número entero: ");
                edad[i] = int.Parse(Console.ReadLine());
            }
            d1(edad);
            d2(edad);
            d3(edad);
            Console.WriteLine("La suma de los números es:" + GetSuma());
            Console.WriteLine("El promedio de los números es:" + GetPromedio());
            Console.WriteLine("El número mayor es:" + GetNumMayor());
        }

    }
}
