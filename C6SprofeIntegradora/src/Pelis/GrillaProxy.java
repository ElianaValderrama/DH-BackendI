package Pelis;

public class GrillaProxy implements IGrillaPeliculas{

    private GrillaPeliculas grillaPeliculas;

    private IP ip;

    @Override
    public Pelicula getPelicula(String nombre) throws PeliculasNoHabilitadas{
        Pelicula pelicula = grillaPeliculas.getPelicula(nombre);
        if(! ip.getPais().equalsIgnoreCase(pelicula.getPais())){
            throw new PeliculasNoHabilitadas(nombre+ " No esta habilida para "+ getIp().getPais());
        }
        return pelicula;
    }

    public GrillaProxy(GrillaPeliculas grillaPeliculas) {
        this.grillaPeliculas = grillaPeliculas;
    }

    public IP getIp() {
        return ip;
    }

    public void setIp(IP ip) {
        this.ip = ip;
    }
}
