using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trabajo_9
{
    class Gasolinera
    {
		private double galones;

		public double  Galones
		{
			get { return galones; }
			set { galones = value; }
		}
		private double precio;

		public double Precio
		{
			get { return precio; }
			set { precio = value; }
		}

		//Valor Definido
		public Gasolinera()
		{
			this.Precio = 16.49;
		}
		public double CostearPorLitro()
		{
			return Precio * (Galones * 3.78541);
		}
	}
}
