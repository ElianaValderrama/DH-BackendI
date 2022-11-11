package Empleados;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        Empresa empresaOutput = new Empresa("Digital",1);

        Empleado empleado1 = new Empleado("Pancho","Rivera",1,20);
        Empleado empleado2 = new Empleado("Benito","Juarez",2,20);
        Empleado empleado3 = new Empleado("Jhonny","Rivera",3,20);

        empresaOutput.agregarEmpleado(empleado1);
        empresaOutput.agregarEmpleado(empleado2);
        empresaOutput.agregarEmpleado(empleado3);

        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("Empresa.txt");
            BufferedOutputStream bos= new BufferedOutputStream(fos);
            for (Empleado empleado: empresaOutput.getEmpleados()) {
                bos.write(empleado.obtenerAtributos().getBytes(StandardCharsets.UTF_8));
            }
            bos.close();

        }catch (FileNotFoundException e){
            System.out.println("FileNotFound Exception");
        }catch (Exception e){
            System.out.println("Error");
        }

        Empresa empresaInput = null;
        FileInputStream fis = null;
        try{
            fis =  new FileInputStream("Empresa.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;

            while ((i=bis.read())!=-1){
                System.out.print((char) i);
            }
            bis.close();

        }catch (FileNotFoundException e){
            System.out.println("FileNotFound Exception");
        }catch (Exception e){
            System.out.println("Error");
        }


    }
}
