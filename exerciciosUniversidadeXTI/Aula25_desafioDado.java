/*
	Aula 25 - Universidade XTI
	Desafio do dado - O usuário digita um valor entre 1 e 6 e se for igual o selecionado pelo sistema deve imprimir se errou ou acertou
*/

import java.util.Random;
import java.util.Scanner;

public class Aula25_desafioDado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ïnforme seu palpite:");
		int palpite = sc.nextInt();
		jogaDado(palpite);	
	
	}
	
	public static void jogaDado(int palpite) {
		Random r = new Random();
		int dado = r.nextInt(6) + 1;
		if(palpite == dado) {
			System.out.println("voce acertou !!!");
		}else {
			System.out.println("voce errou !!!");
		}
		
		System.out.println("o lado do dado foi: " + dado); 
		
	}
	    

}