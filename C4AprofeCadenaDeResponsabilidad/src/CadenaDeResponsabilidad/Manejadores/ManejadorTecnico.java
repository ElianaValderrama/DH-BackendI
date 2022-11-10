package CadenaDeResponsabilidad.Manejadores;

import CadenaDeResponsabilidad.Mail;

public class ManejadorTecnico extends Manejador {

    public ManejadorTecnico() {
        this.destino = "tecnico@colmena.com";
        this.asunto = "tecnico";
    }

    @Override
    public String comprobar(Mail mail) {

        String mensaje = "";

        if(this.procesarMail(mail)){
            mensaje = "Enviado a tecnico";
        }else{
            if(this.getSiguente() != null){
                //pasar el mensaje al siguiente responsable
                mensaje = this.getSiguente().comprobar(mail);
            }
        }
        return mensaje;
    }
}


