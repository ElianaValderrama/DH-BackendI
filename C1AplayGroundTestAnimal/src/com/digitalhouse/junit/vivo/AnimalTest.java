package com.digitalhouse.junit.vivo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void siElAnimalEsPesado(){
        Animal caballo = new Animal("caballo", "grande", 3000);
        Animal perro = new Animal("perro", "mediano", 20);

        boolean esPesado = caballo.esPesado();
        boolean esPesado1 = perro.esPesado();

        assertEquals(true, esPesado);
        assertFalse(esPesado1);

    }

}