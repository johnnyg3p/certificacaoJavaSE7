/*
	Aula 28 - universidade XTI
	Fluxo de repeticao while e do while
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Aula29_fluxoRepeticaoWhile {

	public static void main(String[] args) {
		
		fluxoWhile(30);
		fluxoDoWhile(30);
		//imprimirListaProdutos();
		
	}
	
	//Primeiro exemplo do fluxo de repeticao while
	public static void fluxoWhile(int valor) {
		int i = 0;
		while(i < valor) {
			System.out.print(i);
			
			i++;
		}
		System.out.println("");
	}
	
	//Mais um exemplo de while mais incrementado
	public static void imprimirListaProdutos() {
		
		int i = 1;
		Scanner sc = null;
		String produto = null;
		ArrayList<String> listaProdutos = new ArrayList<String>();
		
		System.out.println("para terminar de inserir produtos, digite FIM");
		System.out.println("*********************************");	
		System.out.println("*********************************");	
		
		while(!"FIM".equals(produto)) {
			sc = new Scanner(System.in);
			System.out.println("informe o " + i + "o produto:");
			produto = sc.nextLine();
			listaProdutos.add(produto);
			i++;
		}
		
		System.out.println(listaProdutos.toString());
	}
	
	//Exemplo de doWhile
	public static void fluxoDoWhile(int valor) {
		int i = 0;
		do {
			System.out.print(i);
			i++;
		}while(i < valor);
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	

}