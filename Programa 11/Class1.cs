using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trabajo_11
{
    class Vehiculo
    {
		private int precio;

		public int Precio
		{
			get { return precio; }
			set { precio = value; }
		}
		public double CalcularTotal()
		{
			return Precio + (Precio * .12) + (Precio * .06);
		}
	}
}
