package Facade;

public class ApiTarjeta {

    public int descuento(Tarjeta tarjeta){
        if(tarjeta.getBanco()=="Star Bank"){
            return 20;
        }
        return 0;
    }

}
