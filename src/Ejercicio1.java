import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Introduce el primer número:");
        double numero1 = scanner.nextDouble();
        calculadora.setX(numero1);

        System.out.println("Introduce el segundo número:");
        double numero2 = scanner.nextDouble();
        calculadora.setY(numero2);

        double resultado = calculadora.suma();
        System.out.println("La suma es : " + resultado);

        scanner.close();
    }
}
