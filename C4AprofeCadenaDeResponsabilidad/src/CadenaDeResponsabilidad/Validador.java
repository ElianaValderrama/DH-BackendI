package CadenaDeResponsabilidad;

import CadenaDeResponsabilidad.Manejadores.*;

public class Validador {

    private Manejador inicial;
    private String mensaje = "Es Spam";

    public Validador() {
        //Creamos los eslabones de la cadena
        this.inicial = new ManejadorGerencial();
        Manejador tecnica = new ManejadorTecnico();
        Manejador comercial = new ManejadorComercial();
        Manejador spam = new ManejadorSpam();
        //Unimos los eslabones
        inicial.setSiguente(comercial);
        comercial.setSiguente(tecnica);
        tecnica.setSiguente(spam);
    }

    public boolean comprobar(Mail mail){
        return (!mensaje.equalsIgnoreCase(inicial.comprobar(mail)));
    }

}
