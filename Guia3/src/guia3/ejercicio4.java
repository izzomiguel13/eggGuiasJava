/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class ejercicio4 {
    
    /* Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false. */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número para saber si es primo: ");
        int num = leer.nextInt();
       
        boolean decision = esPrimo(num);
        
        System.out.println(decision);
        
    }
    
   public static boolean esPrimo (int num) {
       
       int contador = 2;
       
       if (num <= 1) {
           
           return false;
           
       }
       
       if (num == 2) {
            
           return true;
           
       }
       
       do {           
           
           if (num % contador == 0) {
               
               return false;
               
           } 
        
           contador++;
           
       } while (contador < num);
       
       return true;
       
   }
    
}
