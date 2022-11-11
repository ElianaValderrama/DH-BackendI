package manejadores;

import mails.Mail;

public class ManejadorTecnico extends Manejador{

    public ManejadorTecnico() {
        this.destino = "tecnico@colmena.com";
        this.asunto = "tecnico";
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
