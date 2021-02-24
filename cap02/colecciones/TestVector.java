/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.colecciones;
import java.util.Collection;
/**
 *
 * @author eduar
 */
public class TestVector 
{
    public static void main(String[] args)
    {
        Collection<String> coll = UNombres.obtenerLista();
        for(String nom: coll)
        {
            System.out.println(nom);
        }
    }
}
