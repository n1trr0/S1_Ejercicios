import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int limite = scanner.nextInt();
        int numeroAnterior = 0;
        int numeroActual = 1;
        System.out.println("Serie de Fibonacci por debajo de " + limite + ":");

        while(numeroActual < limite) {
            System.out.print("" + numeroActual + " ");
            int siguienteNumero = numeroAnterior + numeroActual;
            numeroAnterior = numeroActual;
            numeroActual = siguienteNumero;
        }

        scanner.close();
    }
}