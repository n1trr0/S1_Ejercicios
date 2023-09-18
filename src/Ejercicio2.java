import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");

        // Verificar si se ingresó un número entero
        if (sc.hasNextInt()) {
            int numero = sc.nextInt();

            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        } else {
            System.out.println("No has ingresado un número entero válido.");
        }

        sc.close();
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        // Verificar si el número es divisible por algún número menor o igual a su raíz cuadrada
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}