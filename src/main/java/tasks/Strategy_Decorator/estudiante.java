package tasks.Strategy_Decorator;

public class estudiante {
    private String nombre;
    private int edad;
    private double grado;

    public estudiante(String nombre, int edad, double grado){
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getGrado() {
        return grado;
    }

    @Override
    public String toString() {
        return "estudiante:  " +
                "->'" + nombre + '\'' +
                ", edad=" + edad +
                ", grado=" + grado +
                '}';
    }
}
