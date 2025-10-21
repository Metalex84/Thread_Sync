package example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Contador contador = new Contador();

        MiHilo h1 = new MiHilo(contador);
        MiHilo h2 = new MiHilo(contador);

        h1.start();
        h2.start();

        h1.join();
        h2.join();
        
        System.out.println("Valor final: " + contador.cuenta);
    }
}
