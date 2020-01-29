using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace Examen
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnEdicion_Click(object sender, EventArgs e)
        {
            GBdatospersonales.Enabled = true;
            GBdatosbancarios.Enabled = true;
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            GBdatospersonales.Enabled = false;
            GBdatosbancarios.Enabled = false;
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void btnLimpiar_Click(object sender, EventArgs e)
        {

        }

        private void btnEjecutar_Click(object sender, EventArgs e)
        {
            if (RBfemenino.Checked)
            {
                string[] lineas = { TBNombre.Text, TBApellido.Text, TXDireccion.Text, DTPnacimiento.ToString(), "Femenino", TBCantidad.Text, DTPejecucion.ToString() };
                using (StreamWriter Salida = new StreamWriter("C:\\Users\\bab2p\\source\\repos\\Examen\\Archivo.txt"))
                {
                    foreach (String linea in lineas)
                    {
                        Salida.WriteLine(linea);
                    }
                }
            }
            else if (RBMasculino.Checked)
            {
                string[] lineas = { TBNombre.Text, TBApellido.Text, TXDireccion.Text, DTPnacimiento.ToString(), "Femenino", TBCantidad.Text, DTPejecucion.ToString() };
                using (StreamWriter Salida = new StreamWriter("C:\\Users\\bab2p\\source\\repos\\Examen\\Archivo.txt"))
                {
                    foreach (String linea in lineas)
                    {
                        Salida.WriteLine(linea);
                    }
                }
            }else if (RBotro.Checked)
            {
                string[] lineas = { TBNombre.Text, TBApellido.Text, TXDireccion.Text, DTPnacimiento.ToString(), "Femenino", TBCantidad.Text, DTPejecucion.ToString() };
                using (StreamWriter Salida = new StreamWriter("C:\\Users\\bab2p\\source\\repos\\Examen\\Archivo.txt"))
                {
                    foreach (String linea in lineas)
                    {
                        Salida.WriteLine(linea);
                    }
                }


                if (RBConsulta.Checked)
                {

                }
                else if (RBDeposito.Checked)
                {

                }
                else if (RBretiro.Checked)
                {

                }
            }

        }
    }
}
