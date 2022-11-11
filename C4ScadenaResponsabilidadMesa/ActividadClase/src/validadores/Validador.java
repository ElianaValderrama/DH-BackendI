package validadores;

import mails.Mail;
import manejadores.*;

public class Validador {

    private Manejador inicial;

    public Validador() {
        this.inicial = new ManejadorGerencial();
        Manejador comercial = new ManejadorComercial();
        Manejador tecnico = new ManejadorTecnico();
        Manejador spam = new ManejadorSpam();

        this.inicial.setSiguiente(comercial);
        comercial.setSiguiente(tecnico);
        tecnico.setSiguiente(spam);
    }

    public Boolean comprobarSpam(Mail mail){
        return ! inicial.comprobar(mail).equalsIgnoreCase("Es Spam");
    }
}
