package grupos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    @Test
    void test1(){

        //dado
        Persona persona = new Persona("Juan",18);
        Persona persona2 = new Persona("Pedro",17);
        Persona persona3 = new Persona("Ana",22);
        Persona persona4 = new Persona("Luz",14);
        Persona persona5 = new Persona("Julian",32);
        Grupos grupos = new Grupos();

        //cuando
        grupos.agregarPersona(persona);
        grupos.agregarPersona(persona2);
        grupos.agregarPersona(persona3);
        grupos.agregarPersona(persona4);
        grupos.agregarPersona(persona5);

        //entonces
        Assertions.assertTrue(grupos.getPersonasEnElGrupo()==1); //porque solo debe estar julian
        Assertions.assertEquals(persona.esMayorDeEdad(),true); //esperamos que esta persona sea nayor de edad
        Assertions.assertEquals(persona2.esMayorDeEdad(),false); //esperamos que esta persona no sea nayor de edad
        Assertions.assertEquals(persona3.esMayorDeEdad(),true); //esperamos que esta persona sea nayor de edad
        Assertions.assertEquals(persona4.esMayorDeEdad(),false); //esperamos que esta persona no sea nayor de edad
        Assertions.assertEquals(persona5.esMayorDeEdad(),true); //esperamos que esta persona sea nayor de edad

    }
}