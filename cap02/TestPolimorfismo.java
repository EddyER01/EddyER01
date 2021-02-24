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
public class TestPolimorfismo 
{
    public static void main(String[] args)
    {
        Fecha fec = new FechaDetallada("25/02/2009");
        Object obj = new FechaDetallada("3/12/2008");
        System.out.println("fec = "+fec); // invoca a toString de fec
        System.out.println("obj = "+obj); // invoca a toString de obj
    }
}
