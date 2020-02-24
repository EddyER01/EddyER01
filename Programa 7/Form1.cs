using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Trabajo_7
{
    public partial class Form1 : Form
    {
        Temperatura Temperatura = new Temperatura();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show($"La Temperatura en Grados Farenheit es de {Temperatura.ConvertirAFarenheit()}");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show($"La Temperatura dada en Grados Centigrados es de {Temperatura.GradosCentigrados}");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Temperatura.GradosCentigrados = double.Parse(textBox1.Text);
            textBox1.Clear();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
