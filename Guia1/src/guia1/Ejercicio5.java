/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Ejercicio5 {
    
    /*
    Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = leer.nextInt();
        System.out.println("El doble de su número es: " + numero * 22);
        System.out.println("El triple de su número es: " + numero * 3);
        System.out.println("La raíz cuadrada de su número es: " + Math.sqrt(numero));
    }
    
}
