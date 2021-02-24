/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;
import java.util.Scanner;
/**
 *
 * @author eduar
 */
public class DemoConstantes 
{
    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 7;
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Ingrese n dia de la semana (numero) ");
        int v = scanner.nextInt();
        String dia;
        switch(v)
        {
            case LUNES: dia = "Lunes"; break;
            case MARTES: dia = "Lunes"; break;
            case MIERCOLES: dia = "Lunes"; break;
            case JUEVES: dia = "Lunes"; break;
            case VIERNES: dia = "Lunes"; break;
            case SABADO: dia = "Lunes"; break;
            case DOMINGO: dia = "Lunes"; break;
            default: dia = "Dia Incorrecto... Ingrese un valor entre 1 y 7";
        }
        System.out.println(dia);
    }
}
