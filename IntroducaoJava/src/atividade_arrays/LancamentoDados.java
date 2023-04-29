package atividade_arrays;

import java.util.Random;

public class LancamentoDados {

	public static void main(String[] args) {
		Random valores = new Random();
	    int[] dado = new int[10];
	    int i;
	    int soma = 0, qtd = 1, maiorValor;
	    float media;

        for (i = 0; i < 10; i++) {
            dado[i] = valores.nextInt(6) + 1;
        }

        System.out.print("Valores do dado: ");
        for (i = 0; i < 10; i++) {
            System.out.print(dado[i] + " ");
        }
        System.out.print("\n");

        for (i = 0; i < 10; i++) {
            soma += dado[i];
        }

        media = soma / 10;
        maiorValor = dado[0];

        for (i = 1; i < 10; i++) {
            if (dado[i] > maiorValor) {
            	maiorValor = dado[i];
                qtd = 1;
            } else if (dado[i] == maiorValor) {
                qtd++;
            }
        }

        System.out.println("Média: "+ media);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Maior valor saiu: " + qtd + " vezes");

	}

}
