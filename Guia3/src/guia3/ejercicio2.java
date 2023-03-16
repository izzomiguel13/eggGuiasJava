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
public class ejercicio2 {
    
    /* Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”. */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre, respuesta;
        int edad;
        
        do {            
            
            System.out.println("Ingrese su nombre: ");
            
            nombre = leer.nextLine();
            
            System.out.println("Ingrese su edad: ");
            edad = leer.nextInt();
            
            mayoriaDeEdad(nombre,edad);
           
            System.out.println("¿Quiere que el programa siga mostrando personas? (Si/No): ");
            
            leer.nextLine();
            respuesta = leer.nextLine();
            
        } while (!"No".equals(respuesta)); 
    }
    
    public static void mayoriaDeEdad(String nombre, int edad) {
        
        if (edad >= 18) {
            
            System.out.println(nombre + " es mayor de edad.");
            
        } else System.out.println(nombre + " es menor de edad.");
        
    }
    
}
