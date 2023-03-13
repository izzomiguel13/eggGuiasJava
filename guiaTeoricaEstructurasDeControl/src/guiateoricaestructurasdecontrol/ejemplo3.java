/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiateoricaestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class ejemplo3 {
    
    /* Escriba un programa que valide si una nota esta entre 0 y 10, sino esta entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta. */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10: ");
        int nota = leer.nextInt();

        while (nota > 10 || nota < 0) {
            System.out.println("Su nota es inválida. Ingrese una nota correcta (0-10): ");
            nota = leer.nextInt();
        }
        System.out.println("Su nota es: " + nota + ".");

    }

}
