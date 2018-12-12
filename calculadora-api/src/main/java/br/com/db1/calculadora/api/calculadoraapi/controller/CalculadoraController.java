package br.com.db1.calculadora.api.calculadoraapi.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.calculadora.api.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.api.calculadoraapi.model.Operacao;
import br.com.db1.calculadora.api.calculadoraapi.service.CalculadoraService;

@RestController
@RequestMapping("/api/calculadora_bd")
public class CalculadoraController {

	@Autowired
	private CalculadoraService calculadoraService;

	@GetMapping
	public Calculadora salvaConta(@RequestParam("numeroUm") Double numeroUm,
			@RequestParam("numeroDois") Double numeroDois, @RequestParam("operacao") Operacao operacao,
			@RequestParam("data") LocalDateTime data, @RequestParam("resultado") Double resultado) {
		Calculadora calculadora = calculadoraService.salvaResultado(numeroUm, numeroDois);
		return calculadora;

	}

}
