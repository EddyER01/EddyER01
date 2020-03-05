using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _14
{
    public partial class Form1 : Form
    {
        NumPrimo NumPrimo = new NumPrimo();
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            NumPrimo.Numero = int.Parse(textBox1.Text);
            textBox1.Clear();
            MessageBox.Show($"Numero Primo: {NumPrimo.VerificarNumero()}");
        }
    }
}
