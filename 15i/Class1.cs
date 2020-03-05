using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _15
{
    class Llamada
    {
		private int _intTiempo;

		public int Tiempo
		{
			get { return _intTiempo; }
			set { _intTiempo = value; }
		}
		public double CalcularCosto()
		{
			if(Tiempo<=3)
			{
				return 5;
			}
			else
			{
				return ((Tiempo - 3)*3+5);
			}
		}
	}
}
