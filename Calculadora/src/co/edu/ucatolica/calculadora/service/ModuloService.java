package co.edu.ucatolica.calculadora.service;

public class ModuloService {
	
	
	private int n1;
	private int n2;
	
	
	public ModuloService ( int n1, int n2){
		
		this.n1=n1;
		this.n2=n2;
	}
	
	
	public int modulo (){
		
		return n1%n2;
	}
	
	

}
