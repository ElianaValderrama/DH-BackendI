import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {

    @Test
    void testRetornarRopa(){
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Ropa pantalonDePrueba = flyweightFactory.getRopa("Pantalon");

        assertEquals(pantalonDePrueba.getTipo(), "Pantalon");
    }

    @Test
    void testValidarTamanioFlyweightFactory(){
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Ropa pantalonDePrueba = flyweightFactory.getRopa("Pantalon");

        assertEquals(flyweightFactory.prendas.size(), 1);
    }



}