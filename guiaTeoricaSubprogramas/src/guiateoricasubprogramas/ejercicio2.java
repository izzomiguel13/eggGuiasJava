/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiateoricasubprogramas;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class ejercicio2 {
    
    /* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número sea múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son. */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese dos números para averiguar si son múltiplos: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        esMultiplo(num1,num2);
    }
    


public static void esMultiplo (int num1, int num2){
    
    if (num1%num2 == 0) 
        
        System.out.println("Los números ingresados son múltiplos.");
    
    else System.out.println("Los números ingresados no son múltiplos.");
          
}      
        
}