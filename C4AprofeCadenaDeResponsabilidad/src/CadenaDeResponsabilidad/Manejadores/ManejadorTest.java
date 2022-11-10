package CadenaDeResponsabilidad.Manejadores;

import CadenaDeResponsabilidad.Mail;
import CadenaDeResponsabilidad.Validador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManejadorTest {

    Validador validador;

    Mail mail;

    /*@BeforeAll
    public void iniciar(){
        this.validador = new Validador();
    }*/

    @BeforeEach
    public void init2(){
        this.mail = new Mail();
    }

    @Test
    void validarGerencial(){
        Mail mail = new Mail("franco@mail.com","comercial@colmena.com","comercial");
        Assertions.assertTrue(validador.comprobar(mail));
    }

}