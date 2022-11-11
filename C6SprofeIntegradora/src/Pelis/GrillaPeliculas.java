package Pelis;

import java.util.HashMap;

public class GrillaPeliculas implements IGrillaPeliculas{


    @Override
    public Pelicula getPelicula(String nombre){

        HashMap<String,Pelicula> peliculas = new HashMap<>();
        peliculas.put("Harry Potter",new Pelicula("Harry Potter","Argentina","Link1"));
        peliculas.put("Hallowen",new Pelicula("Hallowen","Colombia","Link2"));
        peliculas.put("E.T.",new Pelicula("E.T.","Brasil","Link3"));

        if(peliculas.containsKey(nombre)){
            return peliculas.get(nombre);
        }

        return null;
    }


}
