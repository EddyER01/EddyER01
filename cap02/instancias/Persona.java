/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.instancias;
import libro.cap02.fechas.Fecha;
import libro.cap02.misclases.FechaDetallada;
/**
 *
 * @author eduar
 */
public class Persona 
{
    private String nombre; // atribto
    private String dni; // atribto
    private Fecha fechaNacimiento; // atribto
    private int cont = 0; // variable de estado
    public Persona(String nombre, String dni, Fecha fecNac)
    {
    this.nombre = nombre;
    this.dni = dni;
    this.fechaNacimiento = fecNac;
    }
    public String toString()
    {
        cont++;
        return nombre + ", DNI: " + dni
        + ", nacido el: " + fechaNacimiento
        + " (" + cont + ")";
    }
}
