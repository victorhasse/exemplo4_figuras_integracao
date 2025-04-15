package figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TestRetangulo {

    @Test
    void testGetArea() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 6;
        Retangulo retangulo = new Retangulo("", base, altura);
        double retornoFeito = retangulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testRetangulo() {
        Retangulo retangulo = new Retangulo();
        assertTrue(("".equals(retangulo.getCor()) && retangulo.getAltura() == 0 && retangulo.getBase() == 0));
    }
}
