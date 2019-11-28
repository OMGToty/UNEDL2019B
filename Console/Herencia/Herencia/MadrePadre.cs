using System;
using System.Collections.Generic;
using System.Text;

namespace Herencia
{
    public class MadrePadre
    {
        private string nombre;
        private string apellido;
        private string edad;

        public string Nombre { get => nombre; set => nombre = value; }
        public string Apellido { get => apellido; set => apellido = value; }
        public string Edad { get => edad; set => edad = value; }

        public void Cortarpelo(String nombre)
        {
            Console.WriteLine("El muchacho" + nombre + " Aprendio a cortar a pelo gracias a su mother");
        }
        public void Saltar_3_metros(String nombre)
        {
            Console.WriteLine("El muchacho" +nombre+" Aprendio a saltar 3 metros gracias a su padre");
        }

    }
}