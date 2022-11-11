package Empleados;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Empresa empresaOutput = new Empresa("Digital House",123456);

        Empleado empleado1 = new Empleado("David","Galvis",123,12345);
        Empleado empleado2 = new Empleado("Lady","Avila",1234,12345);
        Empleado empleado3 = new Empleado("Maria","Cortes",5,12345);
        Empleado empleado4 = new Empleado("Byron","Escobar",7,12345);

        empresaOutput.agregarEmpleado(empleado1);
        empresaOutput.agregarEmpleado(empleado2);
        empresaOutput.agregarEmpleado(empleado3);
        empresaOutput.agregarEmpleado(empleado4);

        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("Empresa.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(empresaOutput);

        }catch (FileNotFoundException e){
            System.out.println("FileNotFound Exception");
        }catch (Exception e){
            System.out.println("Error general");
        }

        //Recuperar la coleccion del archivo para mostrar
        Empresa empresaInput = null;

        FileInputStream fis = null;

        try{
            fis = new FileInputStream("Empresa.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            empresaInput = (Empresa) ois.readObject();

        }catch (FileNotFoundException e){
            System.out.println("FileNotFound Exception");
        }catch (Exception e){
            System.out.println("Error general");
        }

        for(Empleado empleado : empresaInput.getEmpleados()){
            System.out.println(empleado);
        }

    }

}
