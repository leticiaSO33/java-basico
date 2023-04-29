package atividade_java;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int anos, meses, dias, idade;

        System.out.println("Informe sua idade em dias): ");
        idade = input.nextInt();
        input.close();   
        
        anos = idade / 365;
        meses = (idade % 365) / 30;
        dias = (idade % 365) % 30;
        
        System.out.println("Você tem:");
        System.out.println(anos+ " anos");
        System.out.println(meses+ " meses");
        System.out.println(dias+ " dias");       
		
	}

}
