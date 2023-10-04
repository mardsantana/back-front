package br.com.projetocomangular.projetoangularbf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/")
public class ProjetoAngularBfApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Bem-Vindo ao seu Futuro, Mardson!!";

	}
	public static void main(String[] args) {
		SpringApplication.run(ProjetoAngularBfApplication.class, args);
	}

}
