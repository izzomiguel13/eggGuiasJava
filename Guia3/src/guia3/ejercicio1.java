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
public class ejercicio1 {
    
    /* Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main. */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        double resultado = 0;
        
        System.out.println("Ingrese dos números: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.print("Elija una opción: ");
        
        opcion = leer.nextInt();
      
        switch (opcion) {
            
            case 1: resultado = pSuma(num1, num2);
                break;
                
            case 2: resultado = pResta(num1, num2);
                break;
                
            case 3: resultado = pMulti(num1, num2);
                break;
                
            case 4: 
            
                if (num2 == 0) 
                    
                    System.out.println("El divisor ingresado es 0, no se puede realizar la división.");
            
                else resultado = pDivi(num1, num2);
                break;
                
            default: System.out.println("La opción ingresada no es válida.");
    }
        
        if (resultado != 0) {
            System.out.println("El resultado de la operación es: " + resultado);
        }

    } 
    
     public static int pSuma (int num1, int num2) {
         
         int resultado = num1+num2;
         
         return resultado;
         
     }
     
     public static int pResta (int num1, int num2) {
         
         int resultado = num1-num2;
         
         return resultado;
         
     }
     
     public static int pMulti (int num1, int num2) {
         
     int resultado = num1*num2;
         
     return resultado;
         
     }
     
     public static double pDivi (double num1, double num2) {
        
     double resultado = num1/num2;
         
     return resultado;
         
     }
     
}
