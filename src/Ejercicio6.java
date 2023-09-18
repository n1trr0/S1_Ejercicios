import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce números enteros (introduce 'x' para detener la introducción):");

        while (true) {
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("x")) {
                break; // Detener si se ingresa 'x'
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduce un número entero válido o 'x' para detener la introducción.");
            }
        }

        System.out.print("Números introducidos: ");
        for (int i : numeros) {
            System.out.print(i + ", ");
        }

        scanner.close();
    }
}