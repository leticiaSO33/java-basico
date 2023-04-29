package estrutura_de_repeticao;

public class SomaImpares {

	public static void main(String[] args) {
		int soma = 0;
		
		for (int n =1; n<=500; n+=2) {
			if (n % 3 == 0) {
				soma+= n;
				System.out.printf("%d é multiplo de 3. Soma = %d \n",n,soma);
			}
		}

	}

}
