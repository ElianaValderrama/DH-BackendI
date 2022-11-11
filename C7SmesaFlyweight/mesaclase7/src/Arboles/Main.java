package Arboles;

public class Main {
    private static String [] categoria = {"ornamentales", "frutales", "florales"};

    public static void main(String[] args) {
        Flyweigth bosquesito = new Flyweigth();

        for (int i=0;i<1000000;i++){
            if(i<=500000){
                Arboles arbol1 = bosquesito.getArboles(categoria[0]);
                System.out.println(arbol1.toString());
            } else {
                Arboles arbol1 = bosquesito.getArboles(categoria[1]);
                System.out.println(arbol1.toString());
            }
        }
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }


/*    public int getRandomNumber() {
        return (int) ((Math.random() * (2)));
    }
 */
}
