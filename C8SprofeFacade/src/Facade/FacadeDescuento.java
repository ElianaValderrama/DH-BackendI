package Facade;

public class FacadeDescuento {

    private ApiProducto Apiproducto;
    private ApiCantidad Apicantidad;
    private ApiTarjeta Apitarjeta;

    public FacadeDescuento() {
        Apiproducto = new ApiProducto();
        Apicantidad = new ApiCantidad();
        Apitarjeta = new ApiTarjeta();
    }

    public int descuento(Tarjeta tarjeta, int cantidad, Producto producto){
        int descuentoTotal = 0;
        descuentoTotal = descuentoTotal + Apiproducto.descuento(producto);
        descuentoTotal = descuentoTotal + Apicantidad.descuento(cantidad);
        descuentoTotal = descuentoTotal + Apitarjeta.descuento(tarjeta);
        return descuentoTotal;
    }
}
