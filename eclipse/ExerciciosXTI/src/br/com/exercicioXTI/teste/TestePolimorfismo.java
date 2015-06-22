package br.com.exercicioXTI.teste;

/**
 * Exemplos de polimotfismo
 */
import br.com.exercicioXTI.entidades.Animal;
import br.com.exercicioXTI.entidades.Cachorro;
import br.com.exercicioXTI.entidades.Galinha;

public class TestePolimorfismo {
	
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void main(String[] args) {
		
		Animal caozinho = new Cachorro();
		Animal galinha = new Galinha();
		//Animal animal = new Animal(); - nao funciona mais pois a classe mae esta como abstract
		
		//animal.fazerBarulho(); - nao funciona mais pois a classe mae esta como abstract
		caozinho.fazerBarulho();
		galinha.fazerBarulho();
		System.out.println("----------------------------------");
		//Veja que o método vai se comportar de acordo com o tipo de animal passado
		barulho(caozinho);
		barulho(galinha);
		//barulho(animal); - nao funciona mais pois a classe mae esta como abstract
		
		
	}
	
}
