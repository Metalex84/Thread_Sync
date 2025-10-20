package example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    
    @Test
    public void testContadorCreation() {
        Contador contador = new Contador();
        assertEquals(0, contador.cuenta);
    }
    
    @Test
    public void testContadorIncrement() {
        Contador contador = new Contador();
        contador.incrementar();
        assertEquals(1, contador.cuenta);
    }
    
    @Test
    public void testMiHiloCreation() {
        Contador contador = new Contador();
        MiHilo hilo = new MiHilo(contador);
        assertNotNull(hilo);
    }
}
