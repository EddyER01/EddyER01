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
public class TestFecha3 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Fecha1 (dia, mes y anio): "); 
        int dia = scanner.nextInt(); 
        int mes = scanner.nextInt(); 
        int año = scanner.nextInt();
        Fecha f1=new Fecha(dia,mes,año);
        System.out.print("Ingrese Fecha2 (dia, mes y anio): ");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        año = scanner.nextInt();
        Fecha f2=new Fecha(dia,mes,año);
        System.out.println("Fecha 1 = "+f1);
        System.out.println("Fecha 2 = "+f2);
        if( f1.equals(f2) )
        {
            System.out.println("Son iguales !");
        }
        else
        {
            System.out.println("Son distintas...");
        }
    }
}
