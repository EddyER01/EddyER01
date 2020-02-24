using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Trabajo_6
{
    public partial class Form1 : Form
    {
        Articulo Articulo = new Articulo();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show($"El IVA a pagar es de ${Articulo.CalcularIVA()} pesos");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (radioButton1.Checked == true)
            {
                Articulo.Clave = int.Parse(textBox1.Text);
                textBox1.Clear();
            }
            if (radioButton2.Checked==true)
            {
                Articulo.Descripcion = textBox1.Text;
                textBox1.Clear();
            }
            if (radioButton3.Checked==true)
            {
                Articulo.Precio = double.Parse(textBox1.Text);
                textBox1.Clear();
            }
            if (radioButton4.Checked==true)
            {
                Articulo.Cantidad = int.Parse(textBox1.Text);
                textBox1.Clear();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show($"Descripcion: {Articulo.Descripcion}\nClave: {Articulo.Clave}\nPrecio: ${Articulo.Precio}\nCantidad: {Articulo.Cantidad}");
        }

        private void button4_Click(object sender, EventArgs e)
        {
            MessageBox.Show($"El Precio con IVA incluido es de ${Articulo.CalcularIVA() + Articulo.Precio} pesos");
        }
    }
}
