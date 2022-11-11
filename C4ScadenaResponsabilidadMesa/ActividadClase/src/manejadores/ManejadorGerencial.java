package manejadores;

import mails.Mail;

public class ManejadorGerencial extends Manejador{

    public ManejadorGerencial() {
        this.destino = "gerencial@colmena.com";
        this.asunto = "gerencial";
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
