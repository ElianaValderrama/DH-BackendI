package manejadores;

import mails.Mail;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        return "Es Spam";
    }
}
