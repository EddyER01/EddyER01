using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        Calculadora miDia = new Calculadora();
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            MessageBox.Show("Dame la cantidad de dias que quieres transformar a segundos");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            miDia.Dia = int.Parse(textBox1.Text);
            textBox1.Clear();
            MessageBox.Show($"{miDia.Dia} Dia(s)= {miDia.CalcularSegundos()} segundos");
        }
    }
}
