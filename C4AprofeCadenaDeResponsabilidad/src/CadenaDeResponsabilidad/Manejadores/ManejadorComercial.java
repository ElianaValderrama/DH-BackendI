package CadenaDeResponsabilidad.Manejadores;

import CadenaDeResponsabilidad.Mail;

public class ManejadorComercial extends Manejador {

    public ManejadorComercial() {
        this.destino = "comercial@colmena.com";
        this.asunto = "comercial";
    }

    @Override
    public String comprobar(Mail mail) {

        String mensaje = "";

        if(this.procesarMail(mail)){
            mensaje = "Enviado a comercial";
        }else{
            if(this.getSiguente() != null){
                //pasar el mensaje al siguiente responsable
                mensaje = this.getSiguente().comprobar(mail);
            }
        }
        return mensaje;
    }

}
