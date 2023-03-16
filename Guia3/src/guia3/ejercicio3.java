/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/**
 *
 * @author migue
 */
public class ejercicio3 {
    
    /* Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 € */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       convertirMoneda(100, "libras");
        System.out.println("");
        
       convertirMoneda(100, "dólares");
        System.out.println("");
        
       convertirMoneda(100, "yenes");
        System.out.println("");
        
       convertirMoneda(100, "pesos");
        System.out.println("");
        
    }
    
    public static void convertirMoneda (double cantidadEuros, String monedaRecibida) {
        
        double monedaSalida;
        
        switch (monedaRecibida){
            
            case "libras": monedaSalida = cantidadEuros*0.86;
                System.out.println("Se recibieron " + cantidadEuros + "€" + " que han sido convertidos a " + "£" + monedaSalida);
                break;
            
            case "dólares": monedaSalida = cantidadEuros*1.28611;
                System.out.println("Se recibieron " + cantidadEuros + "€" + " que han sido convertidos a " + "USD $" + monedaSalida);
                break;
            
            case "yenes": monedaSalida = cantidadEuros*129.852;
                System.out.println("Se recibieron " + cantidadEuros + "€" + " que han sido convertidos a " + "¥" + monedaSalida);
                break;
                
            default: System.out.println("La moneda ingresada no es válida.");
        }
        
    }
    
}
