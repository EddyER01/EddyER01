using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Trabajo_5
{
    public partial class Form1 : Form
    {
        Fecha Fecha = new Fecha();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ModificarFecha();
        }
        public void ModificarFecha()
        {
            Fecha.Dia = 0;
            Fecha.Mes = 0;
            Fecha.Año = 0;
            Fecha.Dia = int.Parse(textBox1.Text);
            Fecha.Mes = int.Parse(textBox2.Text);
            Fecha.Año = int.Parse(textBox3.Text);
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show(Fecha.MostrarFecha());
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MessageBox.Show(Fecha.ConsultarFechaConLetra());
        }

        private void button4_Click(object sender, EventArgs e)
        {
            MessageBox.Show($"{Fecha.VerificarFecha()}");
        }
    }
}
