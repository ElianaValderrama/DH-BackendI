package manejadores.tests;

import mails.Mail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validadores.Validador;

import static org.junit.jupiter.api.Assertions.*;

class ManejadorTest {


    @Test
    void validarGerencial(){
        Validador validador = new Validador();
        Mail mail = new Mail("algo@mail.com", "comercial@colmena.com", "comercial");

        Assertions.assertTrue(validador.comprobarSpam(mail));
    }

    @Test
    void validarSpam(){
        Validador validador = new Validador();
        Mail mail = new Mail("algo@mail.com", "cosmefulanito@hotmail.com", "Algo");

        Assertions.assertFalse(validador.comprobarSpam(mail));
    }

}