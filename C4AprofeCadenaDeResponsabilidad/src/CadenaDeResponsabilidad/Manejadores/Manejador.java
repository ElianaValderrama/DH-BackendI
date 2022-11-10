package CadenaDeResponsabilidad.Manejadores;

import CadenaDeResponsabilidad.Mail;

public abstract class Manejador {

    protected String asunto;
    protected String destino;
    protected Manejador siguente;

    public Manejador getSiguente() {
        return siguente;
    }

    public void setSiguente(Manejador siguente) {
        this.siguente = siguente;
    }

    public abstract String comprobar(Mail mail);

    public boolean procesarMail(Mail mail){
        return (mail.getDestino().equalsIgnoreCase(this.destino) ||
                mail.getAsunto().equalsIgnoreCase(this.asunto));
    }

}
