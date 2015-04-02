package co.edu.ucatolica.calculadora.service;

public class DivisionService {
	
	
	private double n1;
	private double n2;
	
	
	public DivisionService ( double n1, double n2){
		
		this.n1=n1;
		this.n2=n2;
	}
	
	
	public double division (){
		
		return n1/n2;
	}

}
