/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.fechas;

/**
 *
 * @author eduar
 */
public class TestFecha 
{
    public static void main(String[] args)
    {
        Fecha f = new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAño(1970);
        System.out.println("Dia="+f.getDia());//Imprimo el dia
        System.out.println("Mes="+f.getMes());//Imprimo el mes
        System.out.println("Año="+f.getAño());//Imprimo el año
        System.out.println(f);//Imprimo la fecha
    }
}
