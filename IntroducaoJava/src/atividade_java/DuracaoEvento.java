package atividade_java;

import java.util.Scanner;

public class DuracaoEvento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int horas, minutos, segundos, duracao;
		
		System.out.println("Informe a duração do evento em segundos: ");
        duracao = input.nextInt();
        input.close();
        
        horas = duracao / 3600;
        minutos = (duracao % 3600) / 60;
        segundos = duracao % 60;
        
        System.out.println("A duração do evento foi de:");
        System.out.println(horas+" horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");         
       
	}

}
