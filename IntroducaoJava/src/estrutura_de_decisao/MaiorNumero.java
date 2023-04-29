package estrutura_de_decisao;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, maior;
		    
        System.out.print("Informe um numero inteiro:");
        n1 = input.nextInt();
        maior = n1;
        System.out.print("Informe outro numero inteiro:");
        n2 = input.nextInt();
        System.out.print("Informe o ultimo numero inteiro:");
        n3 = input.nextInt();   
        
        input.close();
        
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("O maior número é: " + maior);
        
        
	}
}
