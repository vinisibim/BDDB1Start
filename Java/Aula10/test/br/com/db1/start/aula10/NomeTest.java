package br.com.db1.start.aula10;

	import org.junit.Assert;
	import org.junit.Test;

public class NomeTest {

		//deve retornar nome maiusculo
		@Test
		public void deveTranformarParaLetraMaiuscula() {
			Nome nome = new Nome();
			String valorTransformado = nome.transformarParaLetraMaiuscula("vinicius sibin");
			Assert.assertEquals("VINICIUS SIBIN", valorTransformado);
		}
		
		// Deve retornar o tamanho do nome
		@Test
		public void deveRetornarTamanhoDoNome() {
			Nome nome = new Nome();
			int tamanhoDoNome = nome.tamanhoDoNome("VINICIUS SIBIN");
			Assert.assertEquals(14, tamanhoDoNome);
				
		}
}
