package br;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class PrincipalTest {
	
	//deve obter uma string com o texto "Test"
	@Test
	public void testTextSucesso() {
		assertEquals("Test", new Principal().getText());
	}
	//deve somar a mais b e retornar o produto
	@Test
	public void testSoma() {
		Assert.assertTrue(new Principal().getSoma(1, 2) == 3);
	}

}
