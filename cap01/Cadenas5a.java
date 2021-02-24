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
public class Cadenas5a 
{
    public static void main(String[] args)
    {
        long hi = System.currentTimeMillis();//obtener milisegundo actual
        StringBuffer sb = new StringBuffer();
        int n=100000; //concateno caracteres
        char c;
        for(int i = 0; i < n; i++)
        {
            c = (char)('A' + i%('Z'-'A'+1)); //obtengo caracteres entre 'A'y'Z'
            sb.append(c);
        }
        long hf = System.currentTimeMillis();//obtener milisegundo actual
        System.out.println(sb.toString());//mostrar cadena
        System.out.println((hf-hi)+" milisegundos"); // muestro la cantidad de milisegundos insumidos
    }
}
