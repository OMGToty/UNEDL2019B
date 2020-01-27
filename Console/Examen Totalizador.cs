using System;

namespace Programa_Ejercicio
{
    class Program
    {
        static void Main(string[] args)
        {
            int a;
            int t;
            int r=0;
            Console.WriteLine("Introduzca el tamanio del arreglo");
            a = int.Parse(Console.ReadLine());
            int[] valores = new int[a];
            for (int i = 0; i < a; i++)
            {
                valores[i] = int.Parse(Console.ReadLine());
            }
            for (int i = 0; i < a; i++)
            {
                Console.WriteLine("Elementos: " + valores[i]);
            }
            static void Swap<T>(ref T lhs, ref T rhs,int a)
            {
                T temp;
                temp = lhs;
                lhs = rhs;
                rhs = temp;
                a++;
                
            }


            for (int i = 0; i < valores.Length; i++)
            {
                for (int j = 0; j < valores.Length - 1; j++)
                {
                    if (valores[j] > valores[j+1])
                    {
                        Swap(ref valores[j],ref valores[j + 1],r);
                        r++;
                    }
                }
            }
            for(int i = 0; i < valores.Length; i++)
            {
                Console.WriteLine("Arreglo ordenado"+valores[i]);
                
            }
            Console.WriteLine("Primer elemento:"+valores[0]);
            Console.WriteLine("Ultimo elemento:" + valores[2]);
            Console.WriteLine("Permutas:" + r);
        }
    }
}
