/**
	Desafio equacao de pell
	Aula 038 - Universidade XTI
*/

import java.util.Scanner;

public class EquacaoPell {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("informe um valor para saber a sua raiz quadrada: ");
		int raiz = sc.nextInt();
		calculaRaizQuadrada(raiz);
		System.out.println("------------------------");
		System.out.println("Calculo com a classe Math totalmente preciso: ");
		classeMath(raiz);
		
	}
	
	public static void calculaRaizQuadrada(int raiz) {
		
		int impar = 1;
		int raizQuadrada = 0;
		
		for(int i = 0; raiz >= impar; i++) {
			
			System.out.println("valor de impar: " + impar);
			
			raiz = raiz - impar;
			impar += 2;
			raizQuadrada = raizQuadrada + 1;
			
		}
		System.out.println("----------");
		System.out.println("----------");
		System.out.println("valor da raiz absoluta: " + raizQuadrada);
		System.out.println("----------");
	}
	
	public static void classeMath(int valor) {
		
		double raiz = Math.sqrt(valor);
		System.out.println("----------");
		System.out.println("Raiz :" + raiz);
		System.out.println("----------");
		
	}
	
	
}