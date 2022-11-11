import java.time.LocalDate;

public class Facade {

    private ApiHotel apiHotel;
    private ApiVuelo apiVuelo;

    public Facade() {
        apiHotel = new ApiHotel();
        apiVuelo = new ApiVuelo();
    }

    public Boolean busquedaVuelo(String destino,LocalDate fechaSalida, Vuelo vuelo){
        return apiVuelo.getVueloPorDestino(destino, vuelo) &&
                apiVuelo.getVueloPorFechaSalida(fechaSalida, vuelo);
    }

    public Boolean busquedaHotel(String ciudad,LocalDate fechaEntrada, Hotel hotel){
        return apiHotel.getHotelPorCiudad(ciudad, hotel) &&
                apiHotel.getHotelPorFechaEntrada(fechaEntrada, hotel);
    }
}
