package models;

import interfaces.ServicioDeDescarga;

public class ServicioDeDescargaProxy implements ServicioDeDescarga {


    @Override
    public Boolean comprobarDescarga(Usuario usuario) {
        return usuario.getSuscripcion().equals("Premium");
    }
}
