package br.com.db1.start.aula10;

/*
1 - FUM que some dois n�meros
2 - FUM que subtraia dois n�meros
3 - FUM que multiplique dois n�meros 
4 - FUM que divida dois n�meros
5 - FUM que diga se o n�mero � par
6 - FUM que receba dois n�meros e diga qual � o maior
7 - FUM que a partir de um valor inicial, mostre os n�meros de �mpares at� 100. 
*/

public class Calculadora {
	// 1 - FUM que some dois n�meros
	public int somaDoisNumeros(Integer num1, Integer num2) {
		return num1 + num2;
	}

	// 2 - FUM que subtraia dois n�meros
	public int subtraiDoisNumeros(Integer num1, Integer num2) {
		return num1 - num2;
	}

	// 3 - FUM que multiplique dois n�meros
	public int multiplicaDoisNumeros(Integer num1, Integer num2) {
		return num1 * num2;
	}

	// 4 - FUM que divida dois n�meros
	public int divideDoisNumeros(Integer num1, Integer num2) {
		return num1 / num2;
	}

	// 5 - FUM que diga se o n�mero � par
	public boolean verificaNumeroPar(Integer num1) {
		boolean result;
		if (num1 % 2 != 0) {
			return result = false;
		} else {
			return result = true;
		}
	}

	// 6 - FUM que receba dois n�meros e diga qual � o maior
	public int numeroMaior(Integer num1, Integer num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}

	// 7 - FUM que a partir de um valor inicial, mostre os n�meros de �mpares at�
	// 100.
	public int numeroImpar(int num1) {
		int TotalNumeroImpar = 0;
		while (num1 < 100) {
			if (num1 % 2 != 0)
				TotalNumeroImpar++;
			num1++;
		}
		return TotalNumeroImpar;
	}
}
