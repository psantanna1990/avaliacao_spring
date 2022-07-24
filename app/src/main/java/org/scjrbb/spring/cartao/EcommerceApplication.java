package org.scjrbb.spring.cartao;

import org.scjrbb.spring.cartao.service.PreCadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {

		SpringApplication.run(EcommerceApplication.class, args);

		// final PreCadastroService preCadastroService;
		// System.out.println("Iniciando a aplicaçãoo .............");

		// // Executar a carga Inicial do banco de preCadastro
		// PreCadastroService preCadastroService = new PreCadastroService();

		// Boolean statusPrecadastro = preCadastroService.run();

		// if (statusPrecadastro) {
		// System.out.println("Aplicação pronta para execução");
		// } else {
		// System.out.println("Não foi possível executar a carga inicial do banco de
		// dados");
		// }

	}

}
