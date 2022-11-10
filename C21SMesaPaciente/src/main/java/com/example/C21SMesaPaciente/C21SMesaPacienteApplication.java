package com.example.C21SMesaPaciente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class C21SMesaPacienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(C21SMesaPacienteApplication.class, args);
	}

	@GetMapping ("/eliana")
	public String holaMundo(){
		return "Hola mundo";
	}

}
