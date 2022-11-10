package CadenaDeResponsabilidad.Manejadores;

import CadenaDeResponsabilidad.Mail;

public class ManejadorGerencial extends Manejador {

    public ManejadorGerencial() {
        this.destino = "gerencial@colmena.com";
        this.asunto = "gerencial";
    }

    @Override
    public String comprobar(Mail mail) {

        String mensaje = "";

        if(this.procesarMail(mail)){
            mensaje = "Enviado a gerencia";
        }else{
            if(this.getSiguente() != null){
                //pasar el mensaje al siguiente responsable
                mensaje = this.getSiguente().comprobar(mail);
            }
        }
        return mensaje;
    }

}
