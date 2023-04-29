package estrutura_de_repeticao;

import java.util.Scanner;

public class SomaAte1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int entrada, soma=1, n=1;
		
	    System.out.println("Informe um numero: ");
	    entrada = input.nextInt();
	    
	    do {
	    	System.out.print(n+ " + ");
	    	n++;
	    	soma += n;    	
	    }while (n < entrada);
	    System.out.print(entrada+ " = " + soma);
	}

}
