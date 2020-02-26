using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tranajo_10
{
    class Restaurante
    {
        public int cantidad1 { get; set; }
        public int cantidad2 { get; set; }
        public int cantidad3 { get; set; }
        public int cantidad4 { get; set; }
        public int cantidad5 { get; set; }
        public int cantidad6 { get; set; }
        public double CalcularCuenta()
        {
            return 15 * cantidad1+18*cantidad2+20*cantidad3+8*cantidad4+5*cantidad5+6*cantidad6;
        }
    }
}
