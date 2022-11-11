package contactos;

import empleados.Empleado;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Contacto implements Serializable{

    private String nombre;
    private String email;
    private String telefono;

    public Contacto(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Contacto> contactos = new ArrayList<>();
        Contacto contacto1 = new Contacto("Tomás", "tomas@gmail.com", "1234567");
        Contacto contacto2 = new Contacto("Santiago", "santi@gmail.com", "7569514");
        Contacto contacto3 = new Contacto("Juliana", "juli@gmail.com", "963741");
        Contacto contacto4 = new Contacto("Tati", "tatilamejor@gmail.com", "82643971");

        contactos.add(contacto1);
        contactos.add(contacto2);
        contactos.add(contacto3);
        contactos.add(contacto4);


        FileOutputStream fileOutputStream;

        try {
            fileOutputStream = new FileOutputStream("contactos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(contactos);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        FileInputStream fis;
        List<Contacto> contactosLeidos = null;
        try{
            fis = new FileInputStream("contactos.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            contactosLeidos = (ArrayList) ois.readObject();
            fis.close();

        }catch (FileNotFoundException e){
            System.out.println("FileNotFound Exception");
        }catch (Exception e){
            System.out.println("Error general");
        }

        for(Contacto contacto : contactosLeidos){
            System.out.println(contacto);
        }
    }
}
