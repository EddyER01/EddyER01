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
public class Cadenas1 
{
    public static void main(String[] args)
    {
        String s = "Esto es una cadena de caracteres";
        String sMayus = s.toUpperCase();
        String sMinus = s.toLowerCase();
        System.out.println("Original: "+s);
        System.out.println("Mayusculas: "+sMayus);
        System.out.println("Minusculas: "+sMinus);
    }
}
