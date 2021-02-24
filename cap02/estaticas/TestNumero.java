/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.estaticas;

/**
 *
 * @author eduar
 */
public class TestNumero 
{
    public static void main(String[] args)
    {
        double d = Numero.sumar(2,3);
        System.out.println(d);
        Numero n1 = new Numero(5);
        n1.sumar(4);
        System.out.println(n1);
        n1.sumar(4).sumar(6).sumar(8).sumar(1);
        System.out.println(n1);
    }
}
