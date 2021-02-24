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
public class TestFecha2 
{
    public static void main(String[] args)
    {
        Fecha f=null;
        f.setDia(2); // aqui tira un error y finaliza el programa
        f.setMes(10); // no se llega a ejecutar
        f.setAño(1970); // no se llega a ejecutar
        System.out.println(f); // no se llega a ejecutar
    }
}
