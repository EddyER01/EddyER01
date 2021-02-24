/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.colecciones;

/**
 *
 * @author eduar
 */
public class MiCola<T> 
{
    private static final int capacidadInicial = 5; private MiColeccion<T> coll = new MiColeccion<T>(capacidadInicial);
    public void encolar(T elm)
    {
        coll.agregar(elm);
    }
    public T desencolar()
    {
        return coll.eliminar(0);
    }
}
