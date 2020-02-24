using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trabajo_7
{
    class Temperatura
    {
		private double gradoscentigrados;

		public double GradosCentigrados
		{
			get { return gradoscentigrados; }
			set { gradoscentigrados = value; }
		}
		public double ConvertirAFarenheit()
		{
			return((GradosCentigrados*1.8)+32);
		}
	}
}
