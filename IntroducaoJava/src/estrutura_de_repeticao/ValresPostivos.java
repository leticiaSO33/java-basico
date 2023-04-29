package estrutura_de_repeticao;

import java.util.Scanner;

public class ValresPostivos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int count = 0;
        float n, soma = 0, media = 0;
        
        System.out.println("Informe um numero: ");
        n = input.nextFloat();
        
       while (n >= 0) {
            count++;
            soma += n;
            System.out.println("Informe um numero: ");
            n = input.nextFloat();           
        }
        
        if (count > 0) {
            media =  soma / count;
        }
        
        System.out.println("Total de valores lidos: " +count);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        
        input.close();

	}
}
