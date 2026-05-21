package com.example.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);

		System.out.println("Hola mundo desde spring boot!!........");
		Cliente cliente = new Cliente (
				1
				,"0943801175"
				,"Elvis"
				,"Laje"
				,"Quito"
				, "0989459305"
				,"emlaje@tecnologicoismac.edu.ec"
				);
		System.out.println(cliente.toString());
		



	}


}
