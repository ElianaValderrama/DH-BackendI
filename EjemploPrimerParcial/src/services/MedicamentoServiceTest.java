package services;

import interfaces.daos.impl.IDaoImpl;
import models.Medicamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoServiceTest {

    private MedicamentoService medicamentoService = new MedicamentoService(new IDaoImpl());
    @Test
    void pruebaGuardadoMedicamentoService(){
        //Arrange -> Dado
        Medicamento medicamentoPrueba = new Medicamento(1, "Alegra", "Sanofi", 15, 50000.00);

        //Act
        medicamentoService.salvarMedicamento(medicamentoPrueba);

        //Assert
        Assertions.assertTrue(medicamentoService.busqueda(1) != null);

    }

    @Test
    void  pruebaBusquedaPorCantidad() {
        //Arrange -> Dado
        Medicamento medicamentoPrueba = new Medicamento(1, "Alegra", "Sanofi", 15, 50000.00);

        //Act
        medicamentoService.salvarMedicamento(medicamentoPrueba);
        Medicamento medicamentoDevuelto = medicamentoService.busquedaPorCantidad(15);

        //Assert
        Assertions.assertTrue(medicamentoDevuelto != null);
    }
}