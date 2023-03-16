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
public class ejercicio1 {
    
    /* Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10. */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        String fraseReemplazada = reemplazarVocales(frase);
        
        System.out.println("Su frase transformada es: \n" + fraseReemplazada);
    }
    
    public static String reemplazarVocales (String frase) {
        
        String fraseSalida = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
            String caracter = frase.substring(i, i+1);
            
            switch (caracter){
                case "a":
                case "A":
                    caracter = "@";
                break;
                case "e":
                case "E":
                    caracter = "#";
                break;
                case "i":
                case "I":
                    caracter = "$";
                break;
                case "o":
                case "O":
                    caracter = "%";
                break;
                case "u":
                case "U":
                    caracter = "*";
                break;
                  
            } 
            
            fraseSalida = fraseSalida.concat(caracter);
            
        }
        
        return fraseSalida;
        
    }
    
}
