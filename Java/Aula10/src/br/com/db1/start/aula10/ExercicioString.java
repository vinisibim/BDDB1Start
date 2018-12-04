package br.com.db1.start.aula10;

import java.util.stream.IntStream;

public class ExercicioString {

	// 1 - FUM que receba um texto e devolva ele em LETRAS MAIUSCULAS
	public String tranformaTextoEmLetraMaiuscula(String nome) {
		return nome.toUpperCase();
	}

	// 2 - FUM que receba um texto e devolva ele em LETRAS MINUSCULAS
	public String tranformaTextoEmLetraMinuscula(String nome) {
		return nome.toLowerCase();
	}

	// 3 - FUM que receba DB1START e retorne a quantidade de letras que existe nesta
	// palavra
	public int contaQuantidadeDeLetra(String palavra) {
		return palavra.length();
	}

	// 4 - FUM que receba DB1START (tendo um espaço no inicio e no fim da palavra) e
	// retorne a quantidade de letras que existe
	public int contaQuantidadeDeLetra2(String palavra) {
		palavra.trim();
		return palavra.length();
	}

	// 5 - FUM que retorne o item 4 com a mesma quantidade de letras do item 3.

	// 6 - FUM que receba o seu nome completo e exiba somente as 4 primeiras letras
	// do seu nome
	public String primeirasLetrasDoNome(String nome) {
		String primeirasLetras = nome.substring(0, 4);
		return primeirasLetras;
	}

	// 7 - FUM que receba o seu nome completo e exiba a partir da terceira letras do
	// seu nome
	public String APartirDa3LetrasDoNome(String nome) {
		String aux = nome.substring(3);
		// System.out.println(aux);
		return aux;
	}

	// 8 - FUM que receba o seu nome completo e exiba somente as 4 ultimas letras do
	// seu nome
	public String UltimasLetrasDoNome(String nome) {
		int qntLetras = nome.length();
		qntLetras = qntLetras - 4;
		String aux = nome.substring(qntLetras);
		System.out.println(aux);
		return aux;
	}

	// 9 - FUM que receba o seu nome completo e substitua o seu primeiro nome por
	// ALUNO/ALUNA
	public String SubstituiPrimeironome(String nome) {
		String aluno = "Aluno";
		String aluna = "Aluna";
		String sobrenome = 
		String restoNome = nome.substring();
	}
	// 10 - FUM que receba o seguinte texto "banana, maçã, melancia" e exiba o texto
	// separadamente.
	// 11 - FUM que receba um texto e exiba quantas vogais tem no texto
	// 12 - FUM que receba um texto e devolva ele invertido

}
