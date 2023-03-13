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
public class ejemplo5 {
    
/*  Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
    el número ingresado seguido de tantos asteriscos como indique su valor. Por
    ejemplo:
    5 *****
    3 ***
    11 ***********
    2 ** 
*/


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, contador;
        contador = 1;

        do {
            System.out.println("Ingrese un número comprendido entre 1 y 20: ");
            num = leer.nextInt();

            if (num >= 1 && num <= 20) {
                contador++;
                System.out.print(num + " ");

                for (int i = 1; i <= num; i++) {
                    if (i == num) {
                        System.out.println("*");
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                System.out.println("Su número es incorrecto.");
            }

        } while (contador <= 4);
    }
    
}
