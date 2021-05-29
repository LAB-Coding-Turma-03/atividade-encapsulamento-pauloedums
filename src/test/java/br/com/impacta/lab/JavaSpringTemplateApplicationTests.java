package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.impacta.models.Carro;

public class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHaveCarwithEncapsulatePrinciple() {
		
		Carro carro = new Carro();
		carro.setCor("Azul");
		carro.setAno(2021);
		carro.setValor(50000.00);
		
		assertEquals("Azul", carro.getCor());
		
	}
	
}
