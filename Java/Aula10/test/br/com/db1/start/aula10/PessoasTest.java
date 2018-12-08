package br.com.db1.start.aula10;

import org.junit.Test;

import org.junit.Assert;

public class PessoasTest {
	Pessoa pessoa = new Pessoa();

	@Test
	public void testar() {
		pessoa.setNome("Vinicius");
		Assert.assertEquals("Vinicius", pessoa.getNome());

	}

	@Test
	public void testarData() {
		pessoa.setDataNascimento(2108);
		Assert.assertEquals("21/08/1998", dataNascimento.getDataNascimento());

	}

	

}
