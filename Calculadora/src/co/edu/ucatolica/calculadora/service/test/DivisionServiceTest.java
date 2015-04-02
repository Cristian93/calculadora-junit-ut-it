package co.edu.ucatolica.calculadora.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.ucatolica.calculadora.service.DivisionService;


public class DivisionServiceTest {

	@Test
	public void testDivisionPositivos() {
		
     DivisionService division = new DivisionService(5.0, 5.0);
		
		double result= division.division();
		
		assertTrue(result==1);
	}
	
	@Test
	public void testDivisionNegativos() {
		
     DivisionService division = new DivisionService(-5.0,-5.0);
		
		double result= division.division();
		
		assertTrue(result== 1.0);
	}
	
	@Test
	public void testDivisionPositivosNegativos() {
		
     DivisionService division = new DivisionService(5.0, -5.0);
		
		double result= division.division();
		
		assertTrue(result==-1.0);
	}

}
