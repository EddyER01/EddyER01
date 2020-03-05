using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp1
{
    class Calculadora
    {
		private int _intDia;

		public int Dia
		{
			get { return _intDia; }
			set { _intDia = value; }
		}
		public double CalcularSegundos()
		{
			return Dia*86400;
		}
	}
}
