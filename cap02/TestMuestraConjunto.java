/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02;
import libro.cap02.fechas.Fecha;
import libro.cap02.misclases.FechaDetallada;
/**
 *
 * @author eduar
 */
public class TestMuestraConjunto 
{
    public static void main(String[] args)
    {
        Object[] arr = { new Fecha(2,10,1970)
        , new FechaDetallada("23/12/1948")
        , new String("Esto es una cadena")
        , new Integer(34) };
        MuestraConjunto.mostrar(arr);
    }
}
