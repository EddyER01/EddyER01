using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trabajo_6
{
    class Articulo
    {
		private int clave;

		public int Clave
		{
			get { return clave; }
			set { clave = value; }
		}
		private string descripcion;

		public string Descripcion
		{
			get { return descripcion; }
			set { descripcion = value; }
		}
		private double precio;

		public double Precio
		{
			get { return precio; }
			set { precio = value; }
		}
		private int cantidad;

		public int Cantidad
		{
			get { return cantidad; }
			set { cantidad = value; }
		}
		public double CalcularIVA()
		{
			return Precio*Cantidad*.16;
		}
	}
}
