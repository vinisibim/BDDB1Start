package br.com.db1.start.aula10;

public class MinhaPrimeiraClasse {

	public static void main(String[] args) {
		Integer numero1 = 5;
		Integer numero2 = 15;
		Integer result = MinhaPrimeiraClasse.soma (numero1, numero2);
		MinhaPrimeiraClasse.imprime(result);
		result = MinhaPrimeiraClasse.sub (numero1, numero2);
		MinhaPrimeiraClasse.imprime(result);
		double result2 = MinhaPrimeiraClasse.div (6, 5);
		MinhaPrimeiraClasse.imprime(result2);
		result = MinhaPrimeiraClasse.mul (numero1, numero2);
		MinhaPrimeiraClasse.imprime(result);
	}

	public static Integer soma (Integer num1, Integer num2) {
		
		return num1 + num2;
	}
	
	public static Integer sub (Integer num1, Integer num2) {
		return num1 - num2;
	}
	
	public static double div (double num1, double num2) {
		return num1 / num2;
	}
	public static Integer mul (Integer num1, Integer num2) {
		return num1 * num2;
	}
	public static void imprime(double valor) {
		System.out.println(valor);
	}
	}

