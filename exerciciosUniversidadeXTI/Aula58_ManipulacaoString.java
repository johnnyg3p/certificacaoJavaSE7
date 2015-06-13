/*
	Primeira parte da aula de manipulacao de Strings
	aula 58 - universidade xti
*/
public class Aula58_ManipulacaoString {

	// Formas para se clarar Strings
	static String nome = "Edney";
	static String nomeCompleto = nome + " Ronan";
	static String jvm = new String("Java Virtual Machime");
	
	//Forma para declarar uma string recebendo um array de char
	static char[] java = {'J','A','V','A'};
	static String j = new String(java);

	public static void main(String[] args) {
		System.out.println(nomeCompleto);
		System.out.println(j);
		
		operacoesString();
		localizacaoString();
		comparandoStrings();
	}
	
	public static void operacoesString() {
		
		String op = "operacoes";
		
		//recebendo o tamanho dessa string
		int tamanho = op.length();
		
		//recendo um char a partir do indice de uma string
		char letra = op.charAt(0);
		
		//Este ja e bem conhecido, dispensa comentarios
		String string = op.toString();
		
		System.out.println("tamanho: " + tamanho + " letra: " + letra + " toString: " + string);
		
	}

	public static void localizacaoString() {
		
		String jvm = "  Java Virtual Machine  ";
		
		//Retorna um int com a posicao de indice que comeca uma paravra
		int inicioIndicePalavra = jvm.indexOf("Machine");
		
		//Retorna um int com a posisao de indice da ultima ocorrencia de uma determina letra
		int ultimaOcorrenciaLetra = jvm.lastIndexOf('a');
		
		//Retorna um boolean perguntando se a String esta vazia
		Boolean vazio = jvm.isEmpty();
		
		System.out.println(vazio + " - " + inicioIndicePalavra + " - " + ultimaOcorrenciaLetra);
		
	}


	public static void comparandoStrings() {

		String xti = "universidadeXTI";
		String XTI = "universidadeXTI";
		String jvm = "Java Virtual Machine";


		//O operador de comparação == serve para comparar String objeto, não seus valores
		boolean isEquals = xti == XTI;
		System.out.println(isEquals); //aqui vai retornar um true

		//Comparando os valores dentro de uma String
		boolean x = xti.equals("UniversidadeXTI"); // aqui retorna um false
		boolean y = xti.equalsIgnoreCase("UNIVERSIDADExti"); // aqui retorna true
		System.out.println(x + " - " + y);

		//Vai retornar um boolean se a string começa com uma letra e depois se termina com uma letra
		boolean comeca = xti.startsWith("u"); // true
		boolean termina = xti.endsWith("i"); // false
		System.out.println(comeca + " - " + termina);

		//Vamos usar o compareTo, este serve para saber o ordem das palavras (bom para ordenacao), datas
		// ele retorna os valores: -1, 0 e 1 - menor, igual ou maior
		int comp = xti.compareTo(XTI); //retorna 0
		int comp2 = xti.compareTo("v"); //retorna -1
		int comp3 = xti.compareTo("t"); //retorna 1
		System.out.println(comp3);

		//Procurando uma string em uma determinada região de outra string
		// achar vai retornar uma boolean
		String texto = "quanto eu fico olhando";
		String procura = "olhando";
		boolean contem = texto.regionMatches(true, 15, procura, 0, 7);
		//explicando os parametros:
		// em true - serve para ignorar o case, ou seja, ignoreCase
		// em 15 - a jvm vai procurar pela palavra a partir do indice 15
		// em procura -  e a palavra que a jvm vai tentar encontrar, no caso é uma variável do tipo String
		// em 0 e 7, significa a partir do indice 15 que é o 2º parâmetro, a jvm vai buscar a palavra do 3º 
		// parâmetro partindo do indice 0 até 7 que é o ultimo parâmetro

		System.out.println(contem);//aqui é true

	}

}