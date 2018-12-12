package br.com.db1.calculadora.api.calculadoraapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.db1.calculadora.api.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.api.calculadoraapi.model.Operacao;
import br.com.db1.calculadora.api.calculadoraapi.repository.CalculadoraRepository;

@Service
public class CalculadoraService {
	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	public Calculadora salvaResultado(Double num1, Double num2) {
		Calculadora calculadora = new Calculadora(num1, num2, null);
		calculadoraRepository.save(calculadora);
		return calculadora;
	}
	
}
