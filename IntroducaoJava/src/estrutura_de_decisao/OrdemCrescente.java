package estrutura_de_decisao;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float n1, n2, n3;
		    
        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextFloat();       
        System.out.print("Digite o segundo numero: ");
        n2 = input.nextFloat();
        System.out.print("Digite o terceiro numero: ");
        n3 = input.nextFloat(); 
        
        input.close();
        
        if (n1 <= n2 && n1 <= n3) {
            if (n2 <= n3) {
                System.out.printf("Exibindo em ordem crescente:%.2f  %.2f  %.2f", n1,n2,n3);
            } else {
                System.out.printf("Exibindo em ordem crescente:%.2f  %.2f  %.2f", n1,n3,n2);
            }
        } else if (n2 <= n1 && n2 <= n3) {
            if (n1 <= n3) {
                System.out.printf("Exibindo em ordem crescente:%.2f  %.2f  %.2f", n2,n1,n3);
            } else {
                System.out.printf("Exibindo em ordem crescente:%.2f  %.2f  %.2f", n2,n3,n1);
            }
        } else {
            if (n1 <= n2) {
                System.out.printf("Exibindo em ordem crescente:%.2f  %.2f  %.2f", n3,n1,n2);
            } else {
                System.out.printf("Exibindo em ordem crescente:%.2f  %.2f  %.2f", n3,n2,n1);
            }
        }
        

	}
}
