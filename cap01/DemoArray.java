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
public class DemoArray 
{
    public static void main(String[] args)
    {
        int arr[] = new int[10];//arreglo de 10 enteros
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor (0 >= fin): ");
        int v = scanner.nextInt();
        int i = 0;
        while(v != 0 && i < 10)
        {
            arr[i++] = v;//asgina valor en arreglo e incrementa su valor
            System.out.print("Ingrese el siguiente valor (0 => fin): ");
            v =  scanner.nextInt();
        }
        for (int j=0; j<i; j++)//recorrer arreglo mostrado su contenido
        {
            System.out.println(arr[j]);
        }
    }
}
