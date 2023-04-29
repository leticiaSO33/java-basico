package estrutura_de_repeticao;

public class Contagem {

	public static void main(String[] args) {
		int n = 233;
		
		do {
			if(n >= 300 && n <=400) {
				n += 3;
				System.out.println(n + " Somando de 3 em 3");			
			}
			else {
				n += 5;
				System.out.println(n + " Somando de 5 em 5");			
			}
		}while(n <= 456);
	}

}
