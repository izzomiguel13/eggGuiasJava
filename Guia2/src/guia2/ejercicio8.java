/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class ejercicio8 {
    
    /* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese el número de lados que quiere que tenga su cuadrado: ");
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j < num; j++) {
                
                if (j == 0 || j == num-1 || i == 0 || i == num-1) {
                    
                    System.out.print("*");
                    
                }else System.out.print(" ");
                
            }
            
            System.out.println(" ");
            
        }
           
    }
    
}
