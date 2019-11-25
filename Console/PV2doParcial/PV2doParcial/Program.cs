using System;
using System.Collections;

namespace PV2doParcial
{
    class Program
    {
        static void Main(string[] args)
        {
            Stack ingreso = new Stack();
            Stack ingreso2 = new Stack();
            char[] valor = new char[10];
            String palabra = "";
            Console.WriteLine("Ingresa tus CARACTERES");
            for(int i = 0; i < valor.Length; i++)
            {
               ingreso.Push(Console.ReadLine());
            }
            while(ingreso != null)
            {
                Console.WriteLine(ingreso.Pop());
            }
          
        }
        }
    }

