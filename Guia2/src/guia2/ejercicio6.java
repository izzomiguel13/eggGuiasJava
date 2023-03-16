/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author migue
 */
public class ejercicio6 {
    
    /* Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú: El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú. */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroDeOpcion, num1, num2, suma, resta, multi, divi;
        String confirmacion;

        System.out.println("Ingrese dos números enteros positivos: ");

        do {

            num1 = leer.nextInt();
            num2 = leer.nextInt();

            if (num1 < 1 || num2 < 1) {
                System.out.println("Alguno de los números ingresados no es entero positivo. Intente nuevamente.");
            }

        } while (num1 < 1 || num2 < 1);

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;
        confirmacion = "n";

        while (toLowerCase(confirmacion) != "s") {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");

            numeroDeOpcion = leer.nextInt();

            switch (numeroDeOpcion) {
                case 1:
                    System.out.println("La suma de sus números es de " + suma + ".");
                    continue;
                case 2:
                    System.out.println("La resta de sus números es de " + resta + ".");
                    continue;
                case 3:
                    System.out.println("La multiplicación de sus números es de " + multi + ".");
                    continue;
                case 4:
                    System.out.println("La división de sus números es de " + divi + ".");
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    leer.nextLine();
                    confirmacion = leer.nextLine();
            }

            if (toLowerCase(confirmacion).equals("s")) {
                break;
            }

        }
    }
    
}
