package atividade_java;

import java.util.Scanner;

public class DistanciaEntrePontos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x1, x2, y1, y2, distancia;
		
		System.out.println("Informe a cordenada x do ponto A:");
		x1 = input.nextFloat();
		System.out.println("Informe a cordenada y do ponto A:");
		y1 = input.nextFloat();
		System.out.println("Informe a cordenada x do ponto B:");
		x2 = input.nextFloat();
		System.out.println("Informe a cordenada x do ponto B:");
		y2 = input.nextFloat();
		
		input.close();
		
	    distancia = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println("A distância entre o ponto A e B é de: " + distancia);
	}

}
