package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Por padrão Spring scaneia somente a pasta springcoredemo e subpastas onde se encontra
o arquivo Application.java.  A pasta com.luv2code.util não será scaneada por estar fora
da pasta com.luv2code.util. Para corrigir é necessário listar explicitamente
as pastas a serem scaneadas.
*/
@SpringBootApplication(
	scanBasePackages={"com.luv2code.springcoredemo","com.luv2code.util"}
)
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
