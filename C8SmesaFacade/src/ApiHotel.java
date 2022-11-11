import java.time.LocalDate;

public class ApiHotel {

    public Boolean getHotelPorFechaSalida(LocalDate fechaSalida, Hotel hotel){
        if (fechaSalida.equals(hotel.getFechaSalida())){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getHotelPorFechaEntrada(LocalDate fechaEntrada, Hotel hotel){
        if (fechaEntrada.equals(hotel.getFechaEntrada())){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getHotelPorCiudad(String ciudad, Hotel hotel){
        if (ciudad.equalsIgnoreCase(hotel.getCiudad())){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
