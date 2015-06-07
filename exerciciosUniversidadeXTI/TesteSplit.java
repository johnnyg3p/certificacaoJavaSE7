
public class TesteSplit {


	public static void main(String[] args) {
		
		cortaString();
	}


	public static void cortaString() {
		
		String valor = "ggggggggg28hhhhhhhh28hhhhhhhhhh28aaaaaaaa";
		String[] toke = valor.split("28");
		System.out.println(toke[0]);
		
	}

}