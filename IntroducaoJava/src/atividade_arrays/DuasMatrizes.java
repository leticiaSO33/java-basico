package atividade_arrays;

import java.util.Scanner;

public class DuasMatrizes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,j;
		float[][] n1 = new float[4][6];
        float[][] n2 = new float[4][6];
        float[][] m1 = new float[4][6];
        float[][] m2 = new float[4][6];
        
        System.out.println("Matriz 1");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 6; j++) {
            	System.out.println("Informe um valor:");
            	n1[i][j] = input.nextFloat();
            }
        }

        System.out.println("Matriz 2"); 
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 6; j++) {
            	System.out.println("Informe um valor:");
            	n2[i][j] = input.nextFloat();
            }
        }

        input.close();

        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 6; j++) {
                m1[i][j] = n1[i][j] + n2[i][j];
            }
        }

        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 6; j++) {
                m2[i][j] = n1[i][j] - n2[i][j];
            }
        }

        System.out.println("Soma das mesmas posições:");
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 6; j++) {
            	System.out.print("["+m1[i][j]+"]");
            }
            System.out.print("\n");
        }
        
        System.out.println("Subtração das mesmas posições:");
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 6; j++) {
            	System.out.print("["+m2[i][j]+"]");
            }
            System.out.print("\n");
        }


	}

}