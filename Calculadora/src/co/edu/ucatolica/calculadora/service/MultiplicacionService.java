package co.edu.ucatolica.calculadora.service;

public class MultiplicacionService {
	

	
	private int n1;
	private int n2;
	
	
	public MultiplicacionService ( int n1, int n2){
		
		this.n1=n1;
		this.n2=n2;
	}
	
	
	public int multiplicacion (){
		
		return n1*n2;
	}

}
