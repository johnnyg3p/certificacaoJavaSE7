package br.com.exercicioXTI.teste;

import br.com.exercicioXTI.entidades.Animal;
import br.com.exercicioXTI.entidades.Cachorro;
import br.com.exercicioXTI.entidades.Galinha;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Animal caozinho = new Cachorro();
		Animal galinha = new Galinha();
		Animal animal = new Animal();
		
		animal.fazerBarulho();
		caozinho.fazerBarulho();
		galinha.fazerBarulho();
		
	}
	
}