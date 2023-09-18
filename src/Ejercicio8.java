import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona humano = new Persona();

        System.out.print("Introduca su nombre: ");
        String nombre = scanner.next();
        humano.setNombre(nombre);

        System.out.print("Introduca su altura: ");
        double altura = scanner.nextDouble();
        humano.setAltura(altura);

        System.out.print("Introduca su edad: ");
        int edad = scanner.nextInt();
        humano.setEdad(edad);

        System.out.println("Datos registrados correctamente...");
        System.out.println("Nombre: " + humano.getNombre());
        System.out.println("Altura: " + humano.getAltura());
        System.out.println("Edad: " + humano.getEdad());
    }
}
