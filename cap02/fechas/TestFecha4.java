/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.fechas;
import java.util.Scanner;
/**
 *
 * @author eduar
 */
public class TestFecha4 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese Fecha (dd/mm/aaaa): ");
        String sFecha = scanner.next();
        Fecha f = new Fecha(sFecha);
        System.out.println("La fecha ingresada es: "+f);
        System.out.print("Ingrese dias a sumar (puede ser negativo): ");
        int diasSum = scanner.nextInt();
        f.addDias(diasSum);
        System.out.println("sumando "+diasSum+" dias, queda: "+f);
    }

}
