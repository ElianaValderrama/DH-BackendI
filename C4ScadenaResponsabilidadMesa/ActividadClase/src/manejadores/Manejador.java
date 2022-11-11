package manejadores;

import mails.Mail;

public abstract class Manejador {
    protected String asunto;
    protected String destino;
    protected Manejador siguiente;

    public Manejador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract String comprobar(Mail mail);

    public Boolean procesarMail(Mail mail){
        return (mail.getDestino().equalsIgnoreCase(this.destino) ||
        mail.getAsunto().equalsIgnoreCase(this.asunto));
    }
}
