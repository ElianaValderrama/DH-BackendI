package Pelis;

public interface IGrillaPeliculas {

    Pelicula getPelicula(String nombre) throws PeliculasNoHabilitadas;

}
