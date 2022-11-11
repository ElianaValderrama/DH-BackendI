import java.time.LocalDate;

public class ApiVuelo {

    public Boolean getVueloPorFechaSalida(LocalDate fechaSalida, Vuelo vuelo){
        if (fechaSalida.equals(vuelo.getFechaSalida())){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getVueloPorFechaRegreso(LocalDate fechaRegreso, Vuelo vuelo){
        if (fechaRegreso.equals(vuelo.getFechaRegreso())){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getVueloPorOrigen(String origen, Vuelo vuelo){
        if (origen.equalsIgnoreCase(vuelo.getOrigen())){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean getVueloPorDestino(String destino, Vuelo vuelo){
        if (destino.equalsIgnoreCase(vuelo.getDestino())){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
