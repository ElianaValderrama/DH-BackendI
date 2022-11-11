import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Hotel decameron = new Hotel(LocalDate.of(2022, 10, 24),
                LocalDate.of(2022, 11, 1), "Cartagena");
        Vuelo airesCriollos = new Vuelo(LocalDate.of(2022, 10,24),
                LocalDate.of(2022, 10, 30), "Medellín", "Cartagena");
        Facade fachada = new Facade();
        Boolean hayHotel = fachada.busquedaHotel(decameron.getCiudad(),
                decameron.getFechaEntrada(), decameron);
        if (hayHotel){
            System.out.println(decameron + " Te sirve" );
        }else {
            System.out.println(decameron + " No te sirve :'(" );
        }

        Boolean hayVuelo = fachada.busquedaVuelo(airesCriollos.getDestino(),
                LocalDate.of(2022, 11, 24), airesCriollos);

        if (hayVuelo){
            System.out.println(airesCriollos + " Te sirve" );
        }else {
            System.out.println(airesCriollos + " No te sirve :'(" );
        }

        if (hayHotel && hayVuelo){
            System.out.println("Andate de vacaciones");
        }
    }
}