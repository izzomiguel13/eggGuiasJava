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
public class ejemplo4 {
    
    /* Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break. */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador, sumatoria, num;

        contador = 0;
        sumatoria = 0;

        do {
            System.out.println("Ingrese un número entero positivo para sumarlo (para finalizar digite 0): ");
            num = leer.nextInt();
            contador += 1;

            if (num > 0) {
                sumatoria += num;
            }

            if (num == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }

        } while (contador < 20);

        if (num != 0) {
            System.out.println("La sumatoria de los números ingresados es de: " + sumatoria + ".");
        }
    }

}
