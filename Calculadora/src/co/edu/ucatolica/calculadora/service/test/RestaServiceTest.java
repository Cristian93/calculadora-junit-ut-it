package co.edu.ucatolica.calculadora.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.ucatolica.calculadora.service.RestaService;


public class RestaServiceTest {

	@Test
	public void testRestaPositivos() {
		
RestaService resta = new RestaService(5, 5);
		
		int result= resta.resta();
		
		assertTrue(result==0);
		
	}
	
	
	@Test
	public void testRestaNegativos() {
		
RestaService resta = new RestaService(-5, -5);
		
		int result= resta.resta();
		
		assertTrue(result==0);
		
	

	}
	
	@Test
	public void testRestaPositivosNegativos() {
		
RestaService resta = new RestaService(5, -5);
		
		int result= resta.resta();
		
		assertTrue(result==10);
		
		
		
		
	}
	
	
	
	
	

}
