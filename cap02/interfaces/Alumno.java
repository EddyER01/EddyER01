/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.interfaces;

/**
 *
 * @author eduar
 */
public class Alumno  implements Comparable<Alumno>
{
    private String nombre; 
    private int edad; 
    private double notaPromedio;
    public Alumno(String nom, int e, double np)
    {
    this.nombre = nom; 
    this.edad = e; 
    this.notaPromedio = np;
    }
    public int compareTo(Alumno otroAlumno)
    {
        return this.edad - otroAlumno.edad;
    }
    public String toString()
    {
        return nombre+", "+edad+", "+notaPromedio;
    }

    public Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getNotaPromedio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
