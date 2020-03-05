using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _14
{
    class NumPrimo
    {
		private int _intNumero;

		public int Numero
		{
			get { return _intNumero; }
			set { _intNumero = value; }
		}
		public bool VerificarNumero(int c=0)
		{
			for (int i = 1; i < Numero; i++)
			{
				if(Numero%i==0)
				{
					c = c+1;
				}
			}
			if(c>2&&Numero==4&&Numero==9)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	}
}
