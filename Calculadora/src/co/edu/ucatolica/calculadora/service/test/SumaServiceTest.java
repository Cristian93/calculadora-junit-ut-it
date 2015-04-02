package co.edu.ucatolica.calculadora.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.ucatolica.calculadora.service.SumaService;

public class SumaServiceTest {

	@Test
	public void testSumaPositivos() {
		SumaService suma = new SumaService(5, 5);
		
		int result= suma.suma();
		
		assertTrue(result==10);
		
		
	}
	@Test
	public void testSumaNegativos() {
		SumaService suma = new SumaService(-5, -5);
		
		int result= suma.suma();
		
		assertTrue(result==-10);
		
		
	}
	@Test
	public void testSumaPositivosNegativos() {
		SumaService suma = new SumaService(5, -5);
		
		int result= suma.suma();
		
		assertTrue(result==0);
		
		
	}

}
