/**
	Tokenizacao de Strings
	Aula 059 - Universidade XTI
*/
public class TokenizacaoString {

	public static void main(String[] args) {
	
		realizaToken();
	
	}

	public static void realizaToken() {
		
		String timesFutebol = "Timao;Palmeiras;Sao Paulo;Santos;";
		String[] tokenTimes = timesFutebol.split(";");
		
		for(String token : tokenTimes) {
			
			System.out.println(token);
			
		}
		
	}

}