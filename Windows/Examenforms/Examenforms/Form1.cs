using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Examenforms
{
    public partial class Form1 : Form
    {
        ArrayList palabra = new ArrayList();
        ArrayList repetidas = new ArrayList();
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            palabra.Add(txtPalabra.Text);
            // repe.Add(txtPalabra.Text);

            foreach (var item in palabra)
            {
                if (!repetidas.Contains(txtPalabra.Text))
                {
                    repetidas.Add(txtPalabra.Text);
                }
                else
                {
                    txtImpresion.Text = ("Esta repetido");
                }
            }

        }

        private void MandarTXT_Click(object sender, EventArgs e)
        {
            using (StreamWriter sw = new StreamWriter(@"C:\Users\bab2p\UNEDL2019B\Windows\Examentaller\Examentaller.txt"))
            {
                foreach (var i in palabra)
                {
                    sw.WriteLine(i);
                }
                sw.WriteLine("Las repetidas fueron: " + repetidas.Count);
                foreach (var i in repetidas)
                {
                    sw.WriteLine(i);
                }
            }
            using (StreamReader sr = new StreamReader(@"C:\Users\bab2p\UNEDL2019B\Windows\Examentaller\Examentaller.txt"))
            {
                string s;
                do
                {
                    s = sr.ReadLine();
                    Ncantidad.Text = palabra.Count.ToString();
                    Nrepetidas.Text = repetidas.Count.ToString();
                    Console.WriteLine(s);
                } while (s != null);
            }

            Console.ReadLine();
        }
    }
    }
    

