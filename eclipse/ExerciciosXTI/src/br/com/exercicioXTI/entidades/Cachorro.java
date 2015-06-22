package br.com.exercicioXTI.entidades;

public class Cachorro extends Animal{

	public Cachorro(double peso, String comida) {
		super(30, "Carne");
	}
	
	public Cachorro() {
		
	}
	
	//Quando a classe é abstrata e possui um metodo abstrato
	// suas classes filhas sao obrigadas a implementa-las
	// se comentarmos esse metodo, o eclipse vai reclamar
	public void fazerBarulho() {
		System.out.println("au, au, au");
	}

	// se desmarcarmos esse método, vai ocorrer um erro, pois o mesmo 
	// esta com o modificador final na classe pai
/*	public void dormir() {
		
	}
*/	
}
