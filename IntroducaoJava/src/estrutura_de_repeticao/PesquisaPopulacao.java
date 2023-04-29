package estrutura_de_repeticao;

import java.util.Scanner;

public class PesquisaPopulacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);				
		int qtdFilhos, habitantes;
		float salario;
		float somaFilhos = 0f;
		float somaSalario = 0f;
		float maiorSalario = 0f;
		float salarioAte100 = 0f;
		
		for(habitantes=0; habitantes<3; habitantes++) {
			System.out.println("Informe a quantidae de filhos: ");
	        qtdFilhos = input.nextInt();
	        System.out.println("Informe o salario: ");
	        salario = input.nextFloat();
	        
	        somaFilhos += qtdFilhos;
	        somaSalario += salario;
	        
	        if(salario > maiorSalario) {
	        	maiorSalario = salario;
	        }
	        
	        if(salario <= 100) {
	        	salarioAte100++;
	        }
		}
		
		input.close();
		
		
		System.out.println("A média salarial é de: " +(somaSalario / habitantes));
		System.out.println("A quantidade média de filhos é de: " +(somaFilhos / habitantes));
		System.out.println("O maior salario é de: " + maiorSalario);
		System.out.println("Percentual de pessoas com salário até R$100,00: " + (salarioAte100 * 100 / habitantes)+"%");
		
		
	}
}
