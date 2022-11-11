package Facade;

public class Main {
    public static void main(String[] args) {
        FacadeDescuento facade = new FacadeDescuento();
        Tarjeta tarjeta = new Tarjeta("1231321","Star Bank");
        Producto producto = new Producto("Lata","Arvejas");
        Tarjeta tarjeta1 = new Tarjeta("12313212","HSBC");
        Producto producto1 = new Producto("Lacteo","Leche");
        Tarjeta tarjeta2 = new Tarjeta("12313212","ICBC");
        Producto producto2 = new Producto("Lacteo","Yogurt");
        System.out.println("Descuento: "+facade.descuento(tarjeta,13,producto));
        System.out.println("Descuento: "+facade.descuento(tarjeta1,26,producto1));
        System.out.println("Descuento: "+facade.descuento(tarjeta2,0,producto2));
    }
}
