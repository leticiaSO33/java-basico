package estrutura_de_repeticao;

import java.util.Scanner;

public class MultiplicarPorTres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float numero, multiplicacao;
		
		  System.out.println("Informe um numero: ");
	      numero = input.nextFloat();
	      input.close();
	      
	      multiplicacao = numero;
	      
	      while(multiplicacao <= 100) {
	    	  System.out.println(multiplicacao + " ");
	    	  multiplicacao *= 3;
	      }
	      System.out.println(multiplicacao);

	}

}
