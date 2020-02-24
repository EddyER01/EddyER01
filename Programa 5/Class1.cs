using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trabajo_5
{
    class Fecha
    {
		private int dia;

		public int Dia
		{
			get { return dia; }
			set { dia = value; }
		}
		private int mes;

		public int Mes
		{
			get { return mes; }
			set { mes = value; }
		}
		private int año;

		public int Año
		{
			get { return año; }
			set { año = value; }
		}
		public string MostrarFecha()
		{
			return ($"{Dia}/{Mes}/{Año}");
		}
		public string ConsultarFechaConLetra()
		{
			if (Mes==1)
			{
				return ($"{Dia}/Enero/{Año}");
			}
			if (Mes == 2)
			{
				return ($"{Dia}/Febrero/{Año}");
			}
			if (Mes == 3)
			{
				return ($"{Dia}/Marzo/{Año}");
			}
			if (Mes == 4)
			{
				return ($"{Dia}/Abril/{Año}");
			}
			if (Mes == 5)
			{
				return ($"{Dia}/Mayo/{Año}");
			}
			if (Mes == 6)
			{
				return ($"{Dia}/Junio/{Año}");
			}
			if (Mes == 7)
			{
				return ($"{Dia}/Julio/{Año}");
			}
			if (Mes == 8)
			{
				return ($"{Dia}/Agosto/{Año}");
			}
			if (Mes == 9)
			{
				return ($"{Dia}/Septiembre/{Año}");
			}
			if (Mes == 10)
			{
				return ($"{Dia}/Octubre/{Año}");
			}
			if (Mes == 11)
			{
				return ($"{Dia}/Noviembre/{Año}");
			}
			if (Mes==12)
			{
				return ($"{Dia}/Diciembre/{Año}");
			}
			else 
			{
				return "Favor de intoducir un mes";
			}	
		}
		public string VerificarFecha()
		{
			if (Mes==1 && Dia>=1 && Dia<=31)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 2 && Dia >= 1 && Dia <= 28)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 3 && Dia >= 1 && Dia <= 31)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 4 && Dia >= 1 && Dia <= 30)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 5 && Dia >= 1 && Dia <= 31)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 6 && Dia >= 1 && Dia <= 30)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 7 && Dia >= 1 && Dia <= 31)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 8 && Dia >= 1 && Dia <= 31)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 9 && Dia >= 1 && Dia <= 30)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 10 && Dia >= 1 && Dia <= 31)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 11 && Dia >= 1 && Dia <= 30)
			{
				return "Fecha Verdadera";
			}
			if (Mes == 12 && Dia >= 1 && Dia <= 31)
			{
				return "Fecha Verdadera";
			}
			if (Año%4==0 && Año%100==0 && Año%400==0 && Mes==2 && Dia>=1 && Dia<=29)
			{
				return "Fecha Verdadera";
			}
			if (Año%4==0 && Año%100==0 && !(Año%400==0) && Mes==2 && Dia>=29)
			{
				return "Fecha Invalida";
			}
			if (Año % 4 == 0 && Año % 100 == 0 && Mes == 2 && Dia >= 1 && Dia <= 29)
			{
				return "Fecha Invalida";
			}
			if (Año % 4 == 0 && !(Año % 100 == 0) && Mes == 2 && Dia>=29)
			{
				return "Fecha Verdadera";
			}
			if (Año%4==0&& Mes == 2 && Dia >=1&&Dia<=29)
			{
				return "Fecha Verdadera";
			}
			else
			{
				return "Fecha Invalida";
			}
		}

	}
    
}
