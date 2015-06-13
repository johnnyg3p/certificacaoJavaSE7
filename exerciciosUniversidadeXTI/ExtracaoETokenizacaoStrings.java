/**
	Segunda parte da aula de manipulacao de String
	Universidade XTI - aulas 058, 059, 060
*/
public class ExtracaoETokenizacaoStrings {

	public static void main(String[] args) {
		
		extrairString();
		
	}
	
	public static void extrairString() {
		
		String texto = "O Brasil e lindo";
		
		//Vamos extrair a palavra lindo de texto acima
		String lindo = texto.substring(11);
		System.out.println("Extracao de palavra - " + lindo);
		
		//Agora vamos pegar a palavra Brasil do texto
		String br = texto.substring(2, 8);
		System.out.println("Extracao da palavra Brasil - " + br);
		
		//Concatenando de forma diferente
		String concatena = br.concat(" que maravilha !!!");
		System.out.println("metodo que concatena - " + concatena);
		
		// Vamos trocar mudar brasil com s para z
		String trocaLetra = br.replace('s', 'z');
		System.out.println("troca da letra s pela z - " + trocaLetra);
		
		//Vamos trocar a primeira ocorrencia da letra a
		String trocaPrimeiraOcorrencia = concatena.replaceFirst("a", "@");
		System.out.println("troca da primeira ocorrencia da letra a por @ - " + trocaPrimeiraOcorrencia);
	
		//Vamos trocar todas as ocorrencias da letra a
		String trocaTodasOcorrencia = concatena.replaceAll("a", "@");
		System.out.println("troca todas as ocorrencias da letra a por @ - " + trocaTodasOcorrencia);
		
		//Converter tudo para letras maiusculas
		String tudoGrande = texto.toUpperCase();
		System.out.println("tudo letra grande: " + tudoGrande);
		
		//Converter tudo para letras minusculas
		String tudoPequeno = texto.toLowerCase();
		System.out.println("tudo letra pequena: " + tudoPequeno);
		
		//para eliminar espacos no meio das palavras
		String espaco = "espa co";
		String juntaEspaco = espaco.trim();
		System.out.println("Juntando os espacos no meio das palavras - " + juntaEspaco);
				
	}

}