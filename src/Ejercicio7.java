import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = scanner.next();

        scanner.close();
        //Palabra del reves
        for(int i=palabra.length()-1; i>-1; i--){
            char caracter = palabra.charAt(i);
            System.out.print(caracter);
        }
        System.out.println();
        //Longitud palabra
        System.out.println("Numero de letras de la palabra: " + palabra.length());
        //Palabra sin vocales
        palabra = palabra.toLowerCase();
        palabra = palabra.replace("a","");
        palabra = palabra.replace("e","");
        palabra = palabra.replace("i","");
        palabra = palabra.replace("o","");
        palabra = palabra.replace("u","");
        System.out.println(palabra);

    }
}
