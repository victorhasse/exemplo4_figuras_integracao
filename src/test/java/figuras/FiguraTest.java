package figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestFigura {

    @Test
    void testGetCor() {
        String retornoEsperado = "Verde";
        Figura retangulo = new Retangulo();
        retangulo.setCor("Verde");
        assertEquals(retornoEsperado, retangulo.getCor());
    }
}
