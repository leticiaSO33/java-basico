package atividade_arrays;

import java.util.Scanner;

public class ExibirValores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] pontuacoes = new int[5];
	    int i, maior;

	    for (i = 0; i < 5; i++) {
	        System.out.println("Digite a pontuação  "+(i + 1));
	        pontuacoes[i] = input.nextInt();
	    }
	    input.close();

	    System.out.print("As pontuações lidas foram: ");
	    for (i = 0; i < 5; i++) {
	        System.out.print(pontuacoes[i] + " ");
	    }
	    System.out.print("\n");

	    maior = pontuacoes[0];
	    for (i = 1; i < 5; i++) {
	        if (pontuacoes[i] > maior) {
	            maior = pontuacoes[i];
	        }
	    }

	    System.out.println("A maior pontuação é: " +maior);

	}

}
