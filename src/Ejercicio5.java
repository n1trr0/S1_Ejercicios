import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
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
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
