package example;

public class Contador {
    public int cuenta = 0;
    
    // Ejecutar esta parte para ver el problema de condición de carrera:

    // public void incrementar() {
    //     cuenta++;
    // }

    public synchronized void incrementar() {
        cuenta++;
    }
}