package br.com.exercicioXTI.entidades;

public class Cachorro extends Animal{

	public Cachorro(double peso, String comida) {
		super(30, "Carne");
	}
	
	public Cachorro() {
		
	}
	
	public void fazerBarulho() {
		System.out.println("au, au, au");
	}
	
}
