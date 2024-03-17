package tasks.Drones;

public class Dron {
    private String nombre;
    private int capacidad;
    private int pesoActual;
    public Dron(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pesoActual = 0;
    }
    public boolean puedeCargar(int peso){
        return pesoActual + peso <= capacidad;
    }
    public void cargar(int peso){
        pesoActual += peso;
    }
    public void reset(){
        pesoActual = 0;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public int getPesoActual(){
        return pesoActual;
    }

}
