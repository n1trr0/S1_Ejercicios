public class Persona {
    private int edad;

    private double altura;

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
