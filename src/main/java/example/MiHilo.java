package example;

public class MiHilo extends Thread {

    @SuppressWarnings("FieldMayBeFinal")
    private Contador count;

    public MiHilo(Contador contador) {
        this.count = contador;
    }

	@Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.incrementar();
        }
    }
}