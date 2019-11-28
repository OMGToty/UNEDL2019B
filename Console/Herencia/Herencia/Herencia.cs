using System;

namespace Herencia
{
    class Herencia
    {
        static void Main(string[] args) 
        {
            MadrePadre hijo = new MadrePadre();
            hijo.Nombre = "Hans";
            hijo.Apellido = "Castillo";
            hijo.Edad = "17";
            Console.WriteLine("El nombre del hijo es: "+hijo.Nombre);
            Console.WriteLine("El apellido del hijo es: "+hijo.Apellido);
            Console.WriteLine("la edad del hijo es: "+hijo.Edad);
            hijo.Saltar_3_metros("Hans");
            hijo.Cortarpelo("hans");

        }
    }
}
