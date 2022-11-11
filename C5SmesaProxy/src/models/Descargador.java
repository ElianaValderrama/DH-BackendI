package models;

import interfaces.ServicioDeDescarga;

public class Descargador {
    public void descargarCancion(Usuario usuario){
        ServicioDeDescargaProxy servicio = new ServicioDeDescargaProxy();
        if (servicio.comprobarDescarga(usuario)){
            System.out.println("Permitir Descarga :D");
        }else {
            System.out.println("No puedes Descargar música :(");
            System.out.println("Hazte premium");
        }
    }
}
