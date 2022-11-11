package Clase15;

import Clase15.BD;
import Clase15.dao.PacienteDaoH2;
import Clase15.model.Domicilio;
import Clase15.model.Paciente;
import Clase15.service.PacienteService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        BD.crearBD();
        PacienteService pacienteService = new PacienteService(new PacienteDaoH2());
        Domicilio domicilio = new Domicilio("Av siempre viva","45","Usme","Bogotá");
        Paciente paciente = new Paciente("Jeisson","López",123, LocalDate.now(),domicilio);
        pacienteService.guardar(paciente);

        List<Paciente> result = pacienteService.buscartodos();
        for(Paciente paciente1 : result) {
            System.out.println(paciente1.getId());
            System.out.println(paciente1.getNombre());
            System.out.println(paciente1.getApellido());
            System.out.println(paciente1.getDni());
            System.out.println(paciente1.getFechaIngreso());
            System.out.println(paciente1.getDomicilio().getId());
            System.out.println(paciente1.getDomicilio().getCalle());
            System.out.println(paciente1.getDomicilio().getNumero());
            System.out.println(paciente1.getDomicilio().getLocalidad());
            System.out.println(paciente1.getDomicilio().getProvincia());
        }

        System.out.println("-------------------------------------------------");

        Paciente paciente1 = new Paciente("Jeisson","López",123, LocalDate.now(),domicilio);
        pacienteService.guardar(paciente);
        List<Paciente> result2 = pacienteService.buscartodos();
        for(Paciente paciente2 : result2)
        {
            System.out.println(paciente2.getId());
            System.out.println(paciente2.getNombre());
            System.out.println(paciente2.getApellido());
            System.out.println(paciente2.getDni());
            System.out.println(paciente2.getFechaIngreso());
            System.out.println(paciente2.getDomicilio().getId());
            System.out.println(paciente2.getDomicilio().getCalle());
            System.out.println(paciente2.getDomicilio().getNumero());
            System.out.println(paciente2.getDomicilio().getLocalidad());
            System.out.println(paciente2.getDomicilio().getProvincia());
        }
    }
}
