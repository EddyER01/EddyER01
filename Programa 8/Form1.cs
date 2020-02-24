using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Trabajo_8
{
    public partial class Form1 : Form
    {
        CambioDivisas CambioDivisas = new CambioDivisas();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show($"El saldo en dolares es de {CambioDivisas.ConvertirADolares()}");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if(radioButton1.Checked==true)
            {
                CambioDivisas.Pesos = double.Parse(textBox1.Text);
                textBox1.Clear();
            }
            else
            {
                CambioDivisas.TipoCambio = double.Parse(textBox1.Text);
                textBox1.Clear();
            }
        }
    }
}
