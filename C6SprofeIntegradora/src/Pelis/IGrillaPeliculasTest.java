package Pelis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IGrillaPeliculasTest {

    @Test
    public void peliculasArgentinas() throws PeliculasNoHabilitadas{
        GrillaProxy proxy = new GrillaProxy(new GrillaPeliculas());
        proxy.setIp(new IP(48,123,123,123));
        String resultado = "";

        resultado = proxy.getPelicula("Harry Potter").getLink();

        Assertions.assertEquals("Link1",resultado);
    }

    @Test
    public void peliculasBrasil() throws PeliculasNoHabilitadas{
        GrillaProxy proxy = new GrillaProxy(new GrillaPeliculas());
        proxy.setIp(new IP(78,123,123,123));
        String resultado = "";

        resultado = proxy.getPelicula("E.T.").getLink();

        Assertions.assertEquals("Link3",resultado);
    }

    @Test
    public void peliculasColombia() throws PeliculasNoHabilitadas{
        GrillaProxy proxy = new GrillaProxy(new GrillaPeliculas());
        proxy.setIp(new IP(123,123,123,123));
        String resultado = "";

        resultado = proxy.getPelicula("Hallowen").getLink();

        Assertions.assertEquals("Link2",resultado);
    }

}