package br.com.db1.start.aula10;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioStringTeste {
	@Test
	public void devetranformarParaLetraMaiuscula() {
		ExercicioString nome = new ExercicioString();
		String valorTransformado = nome.tranformaTextoEmLetraMaiuscula("vinicius sibin");
		Assert.assertEquals("VINICIUS SIBIN", valorTransformado);
	}

	@Test
	public void devetranformarParaLetraMinuscula() {
		ExercicioString nome = new ExercicioString();
		String valorTransformado = nome.tranformaTextoEmLetraMinuscula("VINICIUS SIBIN");
		Assert.assertEquals("vinicius sibin", valorTransformado);
	}

	@Test
	public void deveRetornarTamanhoDaPalavra() {
		ExercicioString nome = new ExercicioString();
		int tamanhoDaPalavra = nome.contaQuantidadeDeLetra("DB1START");
		Assert.assertEquals(8, tamanhoDaPalavra);
	}
	
	@Test
	public void deveRetornarTamanhoDaPalavra2() {
		ExercicioString nome = new ExercicioString();
		int tamanhoDaPalavra = nome.contaQuantidadeDeLetra2(" DB1START ");
		Assert.assertNotEquals(8, tamanhoDaPalavra);
	}
	
	@Test
	public void deveRetornarAs4PrimeirasLetrasDoNome() {
		ExercicioString nome = new ExercicioString();
		String letras = nome.primeirasLetrasDoNome("vinicius");
		Assert.assertEquals("vini", letras);
	}
	
	@Test
	public void deveRetornarAPartirDa3LetrasDoNome() {
		ExercicioString nome = new ExercicioString();
		String letras = nome.APartirDa3LetrasDoNome("vinicius");
		Assert.assertEquals("icius", letras);
		//System.out.println(letras);
	}
	
	@Test
	public void deveRetornarAsUltimasLetrasDoNome() {
		ExercicioString nome = new ExercicioString();
		String letras = nome.UltimasLetrasDoNome("vinicius luiz");
		Assert.assertEquals("luiz", letras);
		//System.out.println(letras);
	}
	
	@Test
	public void deveSubstituirPrimeiroNome() {
		ExercicioString nome = new ExercicioString();
		String letras = nome.SubstituiPrimeironome("vinicius luiz");
		Assert.assertEquals("Aluno luiz", letras);
		//System.out.println(letras);
	}
	
	public void deveSepararAsPalavras() {
		
		
		ExercicioString palavra = new ExercicioString();
		String letras = palavra.separaPalavras("banana, maçã, melancia");
		Assert.assertEquals("banana", letras);
		Assert.assertEquals("maçã", letras);
		Assert.assertEquals("melancia", letras);
		System.out.println(letras);
	}
	
	@Test
	public void deveContarTotalDeVogais() {
		ExercicioString vogais = new ExercicioString();
		int palavra = vogais.contaVogais("aeou");
		Assert.assertEquals(4, palavra);
		System.out.println(palavra);
	}
	
	@Test
	public void deveRetornarValorInvertido() {
	ExercicioString texto = new ExercicioString();
	String textoReverso = texto.retornarValorInvertido("vinicius");
	Assert.assertEquals("suiciniv", textoReverso);
	}
}
