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
public class ejemplo1 {
    
    /*Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.*/


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números ingresados son mayores a 25.");
        }
          
        else if (num1 > 25) {
            System.out.println("Su primer número ingresado es mayor a 25.");
        } 
        
        else if (num2 > 25) {
            System.out.println("Su segundo número ingresado es mayor a 25.");
        }
        
        else {
            System.out.println("Ninguno de los números ingresados es mayor a 25.");
        }
    }
        }
               
                
                
    
    

