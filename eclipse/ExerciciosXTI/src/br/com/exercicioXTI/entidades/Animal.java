package br.com.exercicioXTI.entidades;

public abstract class Animal {

	protected int serial;
	double peso;
	String comida;
	
	public Animal() {
		
	}
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	// quando colocamos o modificador de acesso final em nossos metodos, significa que ele nao 
	// pode ser sobrescrito pelas classes finhas
	public final void dormir() {
		System.out.println("dormiu");
	}
	
	//quando colocamos abstract, estamos obrigando todos as classes filhas a implementar
	public abstract void fazerBarulho();
	
}
