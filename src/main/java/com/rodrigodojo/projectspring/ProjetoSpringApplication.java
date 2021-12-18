package com.rodrigodojo.projectspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoSpringApplication {

	private static Logger logger = LoggerFactory.getLogger(ProjetoSpringApplication.class);

	public static void main(String[] args) {

		logger.info("Iniciando a aplicacao");

		SpringApplication.run(ProjetoSpringApplication.class, args);

		logger.info("Aplicacao pronta para uso");

	}

}
