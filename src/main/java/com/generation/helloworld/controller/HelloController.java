package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "BSM <br /><br />Comunicação <br /> Persistência! <br />  Proatividade <br />Mentalidade de Crescimento<br /> Orientação ao Futuro <br /> Trabalho em equipe <br /> Responsabilidade Pessoal <br /> Atenção aos Detalhes";
	}
	
	@GetMapping("/obj")
	public String obj() {
		return "<b>OBJETIVOS DA SEMANA <b/> <br /> <br /> Me aprofundar mais no Spring <br /> Me aprofundar em Banco de Dados <br /> Aprender a usar o Insomnia <br /> Começar o meu blog pessoal <br /> Continuar avançando no Projeto Integrador";
	}
}
