/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.interfaces.criterios;
import libro.cap02.interfaces.Alumno;
/**
 *
 * @author eduar
 */
public class CriterioAlumNotaProm extends Criterio<Alumno>
{
    public int comparar(Alumno a, Alumno b)
    {
        double diff = a.getNotaPromedio()-b.getNotaPromedio(); 
        return diff>0 ? 1: diff <0 ? -1 : 0;
    }
}
