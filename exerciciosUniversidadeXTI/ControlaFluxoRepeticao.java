/*
	Controlando fluxos de repeticao com uso de break, continue e label
	Aula univerisdade xti - 030
*/
public class ControlaFluxoRepeticao {

	public static void main(String[] args) {
	
		utilizarBreak();
		System.out.println("-------");
		utilizarContinue();
		System.out.println("-------");
		utilizarLabel();
	
	}


	public static void utilizarBreak() {
		int numero = 0;
		
		while(numero < 10) {
			++numero;
			System.out.println(numero);
			
			//Aplicando uma condicional para o break, ele vai para o fluxo quando
			//o numero 7 for impresso na tela
			if(numero == 7) {
				break;
			}
		}
	}
		
		public static void utilizarContinue() {
		
			for(int i = 0; i < 10; i++) {
			
				//Aplicando uma condicional para o continue, ele vai pular o loop quando
				//chegar no 7, ou seja, vai imprimir de 0 a 6 e depois de 8 a 9 
				if(i == 7) {
					System.out.println("vai pular aqui!!!");
					continue;
				}

				System.out.println(i);
				
			}
		}
		
		public static void utilizarLabel() {
		
			boolean[][] matrix = {
				{false, true, false, false, false},
				{false, false, false, false, false}		
			};
			
			//Quando utilizamos break, ele sempre vai quebrar o loop mais interno
			//Usamos o label para economizarmos memoria pois vai para o fluxo, na qual
			//quizer, isso só depende de onde vamos colocar o label
			labelForExterno: //nesta linha vamos colocar o label
			for(int i =0; i < matrix.length; i++) {
				System.out.println("A");
				for(int j =0; j< matrix[i].length; j++) {
					System.out.println("B");
					if(matrix[i][j]) {
						System.out.println("TRUE");
						break labelForExterno; // este break vai pular o for de fora
					}
				}
			}
			
		}	

















}