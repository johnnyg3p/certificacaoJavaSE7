package br.com.exercicioXTI.entidades;

public class Animal {

	protected int serial;
	double peso;
	String comida;
	
	public Animal() {
		
	}
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	public void dormir() {
		System.out.println("dormiu");
	}
	
	public void fazerBarulho() {
		System.out.println("fazer barulho");
	}
	
}