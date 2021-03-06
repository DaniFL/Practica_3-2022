/**
 * Paquete aplicación que contiene la clase Principal.
 */
package aplicacion;

import interfaz.*;
import java.util.Scanner;

/**
 * Clase Principal que alberga el método main de nuestro programa.
 */
public class Principal {

    /**
     * Método Main que inicializa el programa.
     * @param args array de argumentos que recibe los valores necesarios para realizar la aproximación.
     */
    public static void main(String[] args) {
        System.out.println("Introduzca un número: ");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.close();
        Interfaz operaciones = (pi) -> {
            double d = 0;
            double intentos = n;

            while (intentos > 0) {
                double X = Math.random() * 2 - 1;
                double Y = Math.random() * 2 - 1;
                if (Math.pow(X, 2) + Math.pow(Y, 2) <= 1) {
                    d++;
                }
                intentos--;
            }
            System.out.println(4 * d / n);
        };
        System.out.print("Pi = ");
        operaciones.generarPi(n);
    }
}