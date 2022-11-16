import presencial.App;

public class Main {
    public static void main(String[] args) {

        App aplicacion = new App();

        aplicacion.agregarEntero((25));
        aplicacion.agregarEntero((34));
        aplicacion.agregarEntero((54));
        aplicacion.agregarEntero((65));
        aplicacion.agregarEntero((76));
        aplicacion.agregarEntero((12));
        aplicacion.agregarEntero((43));
        aplicacion.agregarEntero((44));
        aplicacion.agregarEntero((6));

        try{
            aplicacion.calcularPromedio();
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}