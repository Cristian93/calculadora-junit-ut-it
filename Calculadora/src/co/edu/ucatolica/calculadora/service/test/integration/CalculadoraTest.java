package co.edu.ucatolica.calculadora.service.test.integration;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.ucatolica.calculadora.service.RestaService;
import co.edu.ucatolica.calculadora.service.SumaService;

public class CalculadoraTest {
	
	@Test
	public void calculadora(){
	
		//5+9-7+4-2
		
SumaService service = new SumaService(5, 9);
		
		int resultado = service.suma();
		
		assertTrue(resultado == 14);
		
		RestaService restaService = new RestaService(resultado, 7);
		
		resultado = restaService.resta();
		
		assertEquals(7, resultado);
		
		SumaService sumaService = new SumaService(resultado, 4);
		
		resultado = sumaService.suma();
		
		assertEquals(11, resultado);
		
		RestaService resta = new RestaService(resultado, 2);
		
		resultado = resta.resta();
		
		assertEquals(9, resultado);
		
	
		
	}

}
