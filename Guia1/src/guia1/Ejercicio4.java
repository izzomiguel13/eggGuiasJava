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
public class Ejercicio4 {

    /*
    Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
    */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados centígrados:");
        double centigrado = leer.nextDouble();

        double fahrenheit = 32 + (9.0 / 5.0) * centigrado;

        System.out.println("Su temperaura en grados Fahrenheit es: " + fahrenheit + " F");

    }
    
}
