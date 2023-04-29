package atividade_arrays;

import java.util.Scanner;

public class SomaMatriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,j;
        int[][] matriz = new int[3][3];
        int soma = 0, somaDiagonal = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Informe um valor:");
                matriz[i][j] = input.nextInt();
                soma += matriz[i][j];

                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        input.close();

        System.out.println("Matriz digitada:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
            	 System.out.print("["+matriz[i][j]+"]");
            }
            System.out.print("\n");
        }
        System.out.println("A soma da matriz é: " + soma);
        System.out.println("A soma da diagonal principal é: " + somaDiagonal);



	}

}
