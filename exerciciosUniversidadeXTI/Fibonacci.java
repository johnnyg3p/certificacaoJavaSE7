
/*
	Desafio fibonacci aula 29 universidade xti
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor para saber a sequencia de fibonacci: ");
		int valor = sc.nextInt();
		
		sequenciaFibonacci(valor);
		
	}
	
	public static void sequenciaFibonacci(int valor) {
		
		int somaA = 1;
		int somaB = 0;
		int resultado = 0;
		ArrayList<Integer> listaFibonacci = new ArrayList<Integer>();
		
		while(resultado <= valor) {
			
			listaFibonacci.add(resultado);
			resultado = somaA + somaB;
			somaA = somaB;
			somaB = resultado;
			
		}
		
		System.out.println(listaFibonacci.toString());
	}
	
}