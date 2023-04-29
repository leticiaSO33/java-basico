package atividade_java;

import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		
		System.out.println("Informe a 1ª nota:");
		nota1 = input.nextFloat();
		System.out.println("Informe a 2ª nota:");
		nota2 = input.nextFloat();
		System.out.println("Informe a 3ª nota:");
		nota3 = input.nextFloat();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.printf("Média final: %.1f",media);	
		
	}

}
