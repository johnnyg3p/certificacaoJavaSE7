package br.com.exercicioXTI.entidades;

import java.util.ArrayList;
import java.util.Collection;

public class Galinha extends Animal {

	public Galinha(double peso, String comida) {
		super(15, "milho");
	}
	
	public Galinha() {
		
	}
	
	public void fazerBarulho() {
		System.out.println("có, có, có");
	}
	
}
