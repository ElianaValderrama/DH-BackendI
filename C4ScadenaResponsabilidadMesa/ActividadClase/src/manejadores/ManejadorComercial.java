package manejadores;

import mails.Mail;

public class ManejadorComercial extends Manejador{

    public ManejadorComercial() {
        this.destino = "comercial@colmena.com";
        this.asunto = "comercial";
    }

    @Override
    public String comprobar(Mail mail) {
        String mensaje = "";
        if (this.procesarMail(mail)){
            mensaje = "enviado a gerencia";
        }else{
            if (this.getSiguiente() != null){
                mensaje = this.getSiguiente().comprobar(mail);
            }
        }
        return mensaje;
    }
}
