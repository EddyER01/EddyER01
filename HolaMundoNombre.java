/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class HolaMundoNombre {
    public static void main(String[] args)   
    {      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre edad altura: ");
        String nom = scanner.nextLine();
        int edad = scanner.nextInt();
        double altura = scanner.nextDouble();
        System.out.println("Nombre: " + nom+ "Edad: "+edad+"Altura: "+altura);
    }
}
