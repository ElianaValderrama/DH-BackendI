package Perro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        List<Perro> perroOutput = new ArrayList<>();
        Perro perro1 = new Perro("Firulais",12);
        Perro perro2 = new Perro("Toby",10);
        Perro perro3 = new Perro("Panchito",5);
        Perro perro4 = new Perro("Tommy",12);
        Perro perro5 = new Perro("Ayudante de santa",12);
        Perro perro6 = new Perro("Tony",2);
        Perro perro7 = new Perro("Chiquitin",5);
        Perro perro8 = new Perro("Oliver",7);
        Perro perro9 = new Perro("Natacha",9);

        perroOutput.add(perro1);
        perroOutput.add(perro2);
        perroOutput.add(perro3);
        perroOutput.add(perro4);
        perroOutput.add(perro5);
        perroOutput.add(perro6);
        perroOutput.add(perro7);
        perroOutput.add(perro8);
        perroOutput.add(perro9);

        //Guardar toda la coleccion de perros en un archivo
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("salida.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(perroOutput);

        }catch (FileNotFoundException e){
            System.out.println("FileNotFound Exception");
        }catch (Exception e){
            System.out.println("Error general");
        }

        //Recuperar la coleccion del archivo para mostrar
        List<Perro> perrosInput = null;
        FileInputStream fis = null;

        try{

            fis = new FileInputStream("salida.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            perrosInput = (ArrayList) ois.readObject();

        }catch (FileNotFoundException e){
        System.out.println("FileNotFound Exception");
        }catch (Exception e){
        System.out.println("Error general");
        }
        for (Perro perro : perrosInput){
            System.out.println(perro);
        }
    }
}
