using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trabajo_8
{
    class CambioDivisas
    {
		private double pesos;

		public double Pesos
		{
			get { return pesos; }
			set { pesos = value; }
		}
		private double tipocambio;

		public double TipoCambio
		{
			get { return tipocambio; }
			set { tipocambio = value; }
		}
		public double ConvertirADolares()
		{
			return (Pesos/TipoCambio);
		}
	}
}
