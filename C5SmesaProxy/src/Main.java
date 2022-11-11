import models.Descargador;
import models.Usuario;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Usuario usuarioPremium = new Usuario(123456789, "Premium");
        Usuario alejaWilliams = new Usuario(1785963, "No tengo dinero :V");

        Descargador servicioSpotify = new Descargador();
        servicioSpotify.descargarCancion(usuarioPremium);
        servicioSpotify.descargarCancion(alejaWilliams);
    }
}