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
public class ejercicio5 {
    
    /* Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial. */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int valorLimite, sumatoria, num;
        System.out.println("Ingrese un valor límite positivo: ");
        valorLimite = leer.nextInt();
        
        sumatoria = 0;
        
        do {            
            
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            
            sumatoria += num;
            
        } while (sumatoria <= valorLimite);
        
        System.out.println("La suma de los números ingresados es de " + sumatoria + ". " + "Se ha excedido el valor límite de " + valorLimite + ".");
        
    }
    
}
