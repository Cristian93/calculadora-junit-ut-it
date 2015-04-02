package co.edu.ucatolica.calculadora.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.ucatolica.calculadora.service.MultiplicacionService;

public class MultiplicacionServiceTest {

	@Test
	public void testMultiplicacionPositivos() {
		
MultiplicacionService multiplicacion = new MultiplicacionService(5, 5);
		
		int result= multiplicacion.multiplicacion();
		
		assertTrue(result==25);
	}
	
	@Test
	public void testMultiplicacionNegativos() {
		
MultiplicacionService multiplicacion = new MultiplicacionService(-5, -5);
		
		int result= multiplicacion.multiplicacion();
		
		assertTrue(result==25);
	}
	
	@Test
	public void testMultiplicacionPositivosNegativos() {
		
MultiplicacionService multiplicacion = new MultiplicacionService(5, -5);
		
		int result= multiplicacion.multiplicacion();
		
		assertTrue(result==-25);
	}
	
	
	
	

}
