package co.edu.ucatolica.calculadora.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.ucatolica.calculadora.service.ModuloService;


public class ModuloServiceTest {

	@Test
	public void testModuloPositivos() {

		
		
ModuloService modulo = new ModuloService(8, 2);
		
		int result= modulo.modulo();
		
		assertTrue(result==0);
	}
	
	
	
	@Test
	public void testModuloNegativos() {

		
		
ModuloService modulo = new ModuloService(-8, -2);
		
		int result= modulo.modulo();
		
		assertTrue(result==0);
	}
	
	
	
	@Test
	public void testModuloPositivosNegativos() {

	
		
ModuloService modulo = new ModuloService(8, -2);
		
		int result= modulo.modulo();
		
		assertTrue(result==0);
	}

}
