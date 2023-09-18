import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Introduce números (para con la introducción de un número negativo):");

        while (true) {
            try {
                System.out.print("Introduce un número: ");
                double numero = scanner.nextDouble();

                if (numero < 0) {
                    break; // Detener la introducción de datos si se ingresa un número negativo
                }

                numeros.add(numero);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                scanner.nextLine(); // Limpiar entrada
            }
        }

        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }

        System.out.println("La suma de los números es: " + suma);

        scanner.close();
    }
}

