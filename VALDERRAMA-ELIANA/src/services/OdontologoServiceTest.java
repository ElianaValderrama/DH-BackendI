package services;

import interfaces.daos.impl.IDaoImpl;
import models.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    private OdontologoService odontologoService = new OdontologoService(new IDaoImpl());
    @Test
    void testGuardarOdontologo(){
        Odontologo nuevoOdontologo = new Odontologo(111,"Fernando","Palomino");
        odontologoService.salvarOdontologo(nuevoOdontologo);
        Assertions.assertTrue(odontologoService.busqueda(111) != null);

    }

    @Test
    void  testBuscarOdontologo() {
        Odontologo odontologoNuevo = new Odontologo(234,"Emiliana","Palomino");
        odontologoService.salvarOdontologo(odontologoNuevo);
        Odontologo odontologoDevuelto = odontologoService.busqueda(234);
        Assertions.assertTrue(odontologoDevuelto != null);
    }

}