package Integradora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {

    @Test
    void getTrianguloConTamanio2(){
        Triangulo triangulo = FlyweightFactory.getTriangulo("rojo");
        triangulo.setTamanio(23);
        Triangulo triangulo1 = FlyweightFactory.getTriangulo("rojo");
        triangulo1.setTamanio(56);
        Assertions.assertEquals(triangulo.getColor(),"rojo");
    }

    @Test
    void getTrianguloConTamanio3(){
        Triangulo triangulo1 = FlyweightFactory.getTriangulo("rojo");
        triangulo1.setTamanio(56);
        Assertions.assertEquals(triangulo1.getTamanio(),56);
    }

    @Test
    void getTrianguloConTamanio4(){
        Triangulo triangulo = FlyweightFactory.getTriangulo("rojo");
        triangulo.setTamanio(23);
        Triangulo triangulo1 = FlyweightFactory.getTriangulo("rojo");
        triangulo1.setTamanio(56);
        Assertions.assertEquals(FlyweightFactory.triangulos.size(),1);
    }

}