using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _15
{
    public partial class Form1 : Form
    {
        Llamada unaLlamada = new Llamada();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            unaLlamada.Tiempo = int.Parse(textBox1.Text);
            textBox1.Clear();
            MessageBox.Show($"El costo de la llamada es: {unaLlamada.CalcularCosto()}");
        }
    }
}
