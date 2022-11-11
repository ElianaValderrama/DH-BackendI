import empleados.Empleado;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Digital House", 1234);

        Empleado empleado1 = new Empleado("David", "Galvis", 123, 123456.78);
        Empleado empleado2 = new Empleado("Lady", "Ávila", 123, 123456.78);
        Empleado empleado3 = new Empleado("Mechi", "Bakker", 123, 123456.78);
        Empleado empleado4 = new Empleado("Lilly", "Sofía", 123, 123456.78);

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);
        empresa.agregarEmpleado(empleado4);

        FileOutputStream fileOutputStream;

        try {
            fileOutputStream = new FileOutputStream("EmpleadosDeSalida.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(empresa);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        Empresa empresaInput = null;

        FileInputStream fis;

        try{
            fis = new FileInputStream("EmpleadosDeSalida.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            empresaInput = (Empresa) ois.readObject();
            fis.close();

        }catch (FileNotFoundException e){
            System.out.println("FileNotFound Exception");
        }catch (Exception e){
            System.out.println("Error general");
        }

        for(Empleado empleado : empresaInput.getEmpleados()){
            System.out.println(empleado);
        }

        Path path
                = Paths.get("/home/mauricio/Documentos/DigitalHouse/Backend1/221107Clase12/SerializacionClase/empleados.txt");

        try {
            Files.writeString(path, empresa.getEmpleados().toString(),
                    StandardCharsets.UTF_8);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}