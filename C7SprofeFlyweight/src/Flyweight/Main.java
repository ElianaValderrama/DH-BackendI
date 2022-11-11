package Flyweight;

public class Main {
    private static final int ram[] = {8,16,32};
    private static final int disco[] = {128,256};
    public static void main(String[] args) {
        Flyweight computer = new Flyweight();
        Computadora mac = computer.getComputadora(16,528);
        Computadora windows = computer.getComputadora(8,528);
        Computadora Linux = computer.getComputadora(32,256);

        for(int i = 0;i<20;i++){
            Computadora computadora = computer.getComputadora(ramAleatoria(),discoAleatorio());
            System.out.println(computadora);
        }

        System.out.println(mac);
        System.out.println(windows);
        System.out.println(Linux);
    }

    public static int ramAleatoria(){
        return ram[(int)(Math.random()*ram.length)];
    }

    public static int discoAleatorio(){
        return disco[(int)(Math.random()*disco.length)];
    }
}
