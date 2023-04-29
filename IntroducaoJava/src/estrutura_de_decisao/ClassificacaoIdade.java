package estrutura_de_decisao;

import java.util.Scanner;

public class ClassificacaoIdade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade;
		    
        System.out.print("Informe um idade: ");
        idade = input.nextInt();        
        input.close();
        
        if (idade >= 10 && idade <= 14) {
        	System.out.println("10 - 14 Infantil");
        } else if (idade >= 15 && idade <= 17) {
        	System.out.println("15 - 17 Juvenil");
        } else if (idade >= 18 && idade <= 25) {
        	System.out.println("18 - 25 Adulto");
        } else {
        	System.out.println("Sem categoria para essa idade");
        }
        

	}
}
