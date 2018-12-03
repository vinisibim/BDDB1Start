package br.com.db1.start.aula10;

import org.junit.Assert;
import org.junit.Test;



public class CalculadoraTeste {
	@Test
	public void deveSomarDoisNumeros() {
		Calculadora soma = new Calculadora();
		int resultadoSoma = soma.somaDoisNumeros(5, 15);
		Assert.assertEquals(20, resultadoSoma);
	}

	@Test
	public void deveSubtrairDoisNumeros() {
		Calculadora subtrai = new Calculadora();
		int resultadoSub = subtrai.subtraiDoisNumeros(16, 6);
		Assert.assertEquals(10, resultadoSub);
	}

	@Test
	public void deveMultiplicarDoisNumeros() {
		Calculadora multiplica = new Calculadora();
		int resultadoMul = multiplica.multiplicaDoisNumeros(5, 5);
		Assert.assertEquals(25, resultadoMul);
	}

	@Test
	public void deveDividirDoisNumeros() {
		Calculadora divide = new Calculadora();
		int resultadodiv = divide.divideDoisNumeros(20, 2);
		Assert.assertEquals(10, resultadodiv);
	}

	@Test
	public void deveVerificarSeONumeroEPar() {
		Calculadora Numeropar = new Calculadora();
		boolean resultNumeroPar = Numeropar.verificaNumeroPar(6);
		
		// Pode usar o assertTrue
		Assert.assertEquals(true, resultNumeroPar);
	}

	@Test
	public void deveVerificarSeONumeroEImpar() {
		Calculadora NumeroImpar = new Calculadora();
		boolean resultNumeroImpar = NumeroImpar.verificaNumeroPar(5);
		Assert.assertEquals(false, resultNumeroImpar);
	}

	@Test
	public void deveVerificarMaiorNumero() {
		Calculadora NumeroMaior = new Calculadora();
		int numero = NumeroMaior.numeroMaior(5, 10);
		Assert.assertEquals(10, numero);
	}

	@Test
	public void deveTotalNumeroImpar() {
		Calculadora quantidadeNumeroImpar = new Calculadora();
		int total = quantidadeNumeroImpar.numeroImpar(97);
		Assert.assertEquals(2, total);
	}
}
