/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.misclases;

import libro.cap02.fechas.Fecha;

/**
 *
 * @author eduar
 */
public class FechaDetallada extends Fecha
{
    private static String meses[]={"Enero"
    ,"Febrero"
    ,"Marzo"
    ,"Abril"
    ,"Mayo"
    ,"Junio"
    ,"Julio"
    ,"Agosto"
    ,"Septiembre"
    ,"Octubre"
    ,"Noviembre"
    ,"Diciembre"};
    
    public FechaDetallada(int dia, int mes, int año)
    {
        super(dia,mes,año);
    }
    public FechaDetallada()
    {
        this(0,0,0);
    }

    public FechaDetallada(String string) 
    {
        
    }
    
    public String toString()
    {
        return getDia()+" de "+meses[getMes()-1]+" de "+getAño();
    }
}
