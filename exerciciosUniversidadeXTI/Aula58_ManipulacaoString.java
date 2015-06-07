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








}