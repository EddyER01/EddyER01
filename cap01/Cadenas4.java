/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;

/**
 *
 * @author eduar
 */
public class Cadenas4 
{
    public static void main(String[] args)
    {
        String s = "Un buen libro de Java";
        boolean b1 = s.startsWith("Un buen"); //verdaero
        boolean b2 = s.startsWith("A"); //falso
        boolean b3 = s.endsWith("Java"); //verdadero
        boolean b4 = s.endsWith("Chau"); //falso
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
