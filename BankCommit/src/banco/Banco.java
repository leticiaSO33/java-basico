package banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option;
		int qtdCheques;
		int dataConta;
		int countMovimento=0;
		int codConta = 0;	
		float valorMovimento;
		float valorLimite;
		float valorLimiteEspecial;
		float valorEmprestimo;		
		float saldo = 0;		
		char movimento;
		char continuar;
		char usarLimiteEspecial;
		char emprestimo = 'S';
		char usarLimite = 'S';
		boolean aux = false;		
		boolean flagEmprestimo = false;
		boolean statusConta=false;		
		String cpf = null;		
		
		do{	
			while(statusConta==false) {		
				System.out.println("BANK COMMIT");
				System.out.println("Always committed to your financial success\n\n");
				
				System.out.println("CADSTRO DA CONTA");
				System.out.println("Codigo da conta: ");
		    	codConta = input.nextInt();
		    	System.out.println("CPF: ");
		    	cpf = input.next();
		    	System.out.println("Saldo: ");               
		    	saldo = input.nextFloat();
		    	System.out.println("Status da conta: ");		    	
		    	statusConta = input.nextBoolean();
		    	if(statusConta == false) {
		    		System.out.println("Operação finalizada");
		    		System.out.println("Conta INATIVA");		    		
		    	}
			}
			statusConta = false;
			System.out.println();
			System.out.println("1 - Conta poupança");
			System.out.println("2 - Conta corrente");
			System.out.println("3 - Conta especial");
			System.out.println("4 - Conta empresa");
			System.out.println("5 - Conta estudantil");
			System.out.println("6 - sair\n");
		    System.out.println("Infrome o tipo da conta: ");
		    option = input.nextInt();		    

		    while(option < 1 || option>6) {
				System.out.println("OPÇÃO INVALIDA");
				System.out.println("Infrome o tipo da conta: ");
				option = input.nextInt();
			}
		    
			switch(option) {	
			    case 1:
			    	System.out.println("Data da conta:");
			    	dataConta = input.nextInt();
			    	ContaPoupanca cPoupanca = new ContaPoupanca(codConta,cpf,saldo,statusConta);
			    	
			    	System.out.println("\n\n");
			    	do {
				    	do {			    		
				    		System.out.println("Movimento [D / C]: ");
					    	movimento = input.next().charAt(0);					    	
				    	}while ((movimento != 'D' && movimento != 'd') && (movimento != 'C' && movimento != 'c'));	
				    	
				    	System.out.println("Valor: R$");
				    	valorMovimento = input.nextFloat();	
				    	
				    	if (movimento == 'D' || movimento == 'd') {
				    		aux = cPoupanca.debito(valorMovimento);
				    		while(aux == false){				    			
				    			System.out.println("Valor: R$");
						    	valorMovimento = input.nextFloat();
						    	aux = cPoupanca.debito(valorMovimento);
				    		}			    		
				    	}
				    	else {
				    		cPoupanca.credito(valorMovimento);
				    	}
				    	
				    	countMovimento++;			    	
				    	
				    	do {			    		
				    		System.out.println("Continuar [S / N]: ");
				    		continuar = input.next().charAt(0);	
				    		
				    	}while ((continuar != 'S' && continuar != 's') && (continuar != 'N' && continuar != 'n'));
				    	if(countMovimento == 10) {
				    		System.out.println("Limite de movimentação diaria atingido");
				    		System.out.println("FINALIZANDO operação ...");
				    		System.out.println();
				    	}
			    	}while ((continuar == 'S' || continuar == 's') && (countMovimento < 10));		    		    	
			    	
			    	
			    	System.out.println("Informe o dia do Aniversario: ");
			    	cPoupanca.setDiaAniversario(input.nextInt());
			    	cPoupanca.correcao(dataConta);		    	
			    	System.out.println();
			    	cPoupanca.visualizar();		                      
			    	
			    	countMovimento = 0;
			        break;
			        
			    case 2:	    	
			    	ContaCorrente cCorrente = new ContaCorrente(codConta,cpf,saldo,statusConta);		    	
			    	System.out.println("\n\n");
			       
			    	do {
				    	do {			    		
				    		System.out.println("Movimento [D / C]: ");
					    	movimento = input.next().charAt(0);					    	
				    	}while ((movimento != 'D' && movimento != 'd') && (movimento != 'C' && movimento != 'c'));	
				    	
				    	System.out.println("Valor: R$");
				    	valorMovimento = input.nextFloat();	
				    	
				    	if (movimento == 'D' || movimento == 'd') {
				    		aux = cCorrente.debito(valorMovimento);
				    		while(aux == false){				    			
				    			System.out.println("Valor: R$");
						    	valorMovimento = input.nextFloat();
						    	aux = cCorrente.debito(valorMovimento);
				    		}			    		
				    	}
				    	else {
				    		cCorrente.credito(valorMovimento);
				    	}
				    	
				    	countMovimento++;
				    	
				    	do {			    		
				    		System.out.println("Continuar [S / N]: ");
				    		continuar = input.next().charAt(0);							    					    	
				    	}while ((continuar != 'S' && continuar != 's') && (continuar != 'N' && continuar != 'n'));
				    	
				    	if(countMovimento == 10) {
				    		System.out.println("Limite de movimentação diaria atingido");
				    		System.out.println("FINALIZANDO operação ...");
				    		System.out.println();
				    	}	
			    	}while ((continuar == 'S' || continuar == 's') && (countMovimento < 10));			    	
			    	
			    	System.out.println();
			    	do{
			    		System.out.println("Qual o numero de cheques desejado [max.3]: ");
			    		qtdCheques = input.nextInt();
			    		if(qtdCheques <0 || qtdCheques >3) {
			    			System.out.println("valor invalido");
			    		}
			    	}while (qtdCheques <0 || qtdCheques >3);
				    	cCorrente.setQtdCheques(qtdCheques);
				    	cCorrente.pedirTalao();
				    	
				    System.out.println();
			    	cCorrente.visualizar();	    	
			    	countMovimento = 0;
			        break;
			        
			    case 3:
			    	ContaEspecial cEspecial = new ContaEspecial(codConta,cpf,saldo,statusConta);
			    	System.out.println("\n\n");
			       
			    	do{
				    	do {
				    		System.out.println("Movimento [D / C]: ");
					    	movimento = input.next().charAt(0);					    	
				    	}while ((movimento != 'D' && movimento != 'd') && (movimento != 'C' && movimento != 'c'));	
				    	
				    	do{
				    		System.out.println("Valor: R$");			    	
				    	    valorMovimento = input.nextFloat();		
				    	    if (movimento == 'D' || movimento == 'd') {
				    		    aux = cEspecial.debito(valorMovimento);
				    	    }
				    	 }while(aux == false);			    			
				    	 
				    	if (movimento == 'C' || movimento == 'C') {
				    		cEspecial.credito(valorMovimento);
				    	}
				    	
				    	countMovimento++;	
				    	
				    	do {			    		
				    		System.out.println("Continuar [S / N]: ");
				    		continuar = input.next().charAt(0);							    					    	
				    	}while ((continuar != 'S' && continuar != 's') && (continuar != 'N' && continuar != 'n'));
				    	
				    	if(countMovimento == 10) {
				    		System.out.println("Limite de movimentação diaria atingido");
				    		System.out.println("FINALIZANDO operação ...");
				    		continuar = 'n';
				    	}			    	
			    	}while ((continuar == 'S' || continuar == 's') && (countMovimento < 10));
			    	
			    	System.out.println();
			    	cEspecial.visualizar();	
			    	System.out.println();
			    	
				    
		    		if (cEspecial.getLimite() != 0) {
		    			do {
				    		System.out.println("Você ainda tem limite disponível");
					    	System.out.println("Gostaria de usa-lo [S/N]: ");
					    	usarLimiteEspecial = input.next().charAt(0);							
					    	if (usarLimiteEspecial == 'S' ||usarLimiteEspecial == 's') {
					    		do{
					    			System.out.println("Valor: R$");
					    			valorLimiteEspecial = input.nextFloat();
						    		aux = cEspecial.debito(valorLimiteEspecial);
					    		}while (aux == false);
					    		cEspecial.visualizar();	
					    	}	
					    }while(usarLimiteEspecial == 'S' ||usarLimiteEspecial == 's' && cEspecial.getLimite() != 0);			    		
			    	}			    	
			    	System.out.println("FINALIZANDO operação ...");		    		
			    	
		    	    countMovimento = 0;
			        break;  		    	
		        
			    case 4:	    	
			    	ContaEmpresa cEmpresa = new ContaEmpresa(codConta,cpf,saldo,statusConta);		    	
			    	System.out.println("\n\n");
			       
			    	do {
			    		if (cEmpresa.getEmprestimo() != 0) {
					    	System.out.println("Gostaria de um emprestimo[S/N]: ");
					    	emprestimo = input.next().charAt(0);							
					    	if (emprestimo == 'S' ||emprestimo == 's') {
					    		do {
						    		System.out.println("Valor do emprestimo: R$");
							    	valorEmprestimo = input.nextFloat();
							    	
							    	if(valorEmprestimo <= cEmpresa.getEmprestimo()) {
							    		cEmpresa.pedirEmprestimo(valorEmprestimo);
							    		flagEmprestimo = true;
							    	}
							    	else
							    	{
							    		System.out.println("VALOR INVALIDO");
							    		System.out.printf("Emprestimo disponivel: R$%.2f\n",cEmpresa.getEmprestimo());
							    		flagEmprestimo = false;
							    		
							    	}
							    	
					    		}while(flagEmprestimo == false);
					    	}	
			    		}
				    	do {			    		
				    		System.out.println("Movimento [D / C]: ");
					    	movimento = input.next().charAt(0);					    	
				    	}while ((movimento != 'D' && movimento != 'd') && (movimento != 'C' && movimento != 'c'));	
				    	
				    	System.out.println("Valor: R$");
				    	valorMovimento = input.nextFloat();  	
				    	
				    	if (movimento == 'D' || movimento == 'd') {
				    		aux = cEmpresa.debito(valorMovimento);
				    		while(aux == false){				    			
				    			System.out.println("Valor: R$");
						    	valorMovimento = input.nextFloat();
						    	aux = cEmpresa.debito(valorMovimento);
				    		}			    		
				    	}
				    	else {
				    		cEmpresa.credito(valorMovimento);
				    	}
				    	
				    	countMovimento++;
				    	
				    	do {			    		
				    		System.out.println("Continuar [S / N]: ");
				    		continuar = input.next().charAt(0);							    					    	
				    	}while ((continuar != 'S' && continuar != 's') && (continuar != 'N' && continuar != 'n'));
				    	
				    	if(countMovimento == 10) {
				    		System.out.println("Limite de movimentação diaria atingido");			    		
				    	}	
				    	
			    	} while ((continuar == 'S' || continuar == 's') && (countMovimento < 10));	    	
			    	
			    	System.out.println();
			    	cEmpresa.visualizar();	
			    	System.out.println();
			    			    	
			    	do{
			    		if (cEmpresa.getEmprestimo() != 0) {		    	
				    		System.out.println("Você ainda tem emprestimo disponível");
					    	System.out.println("Gostaria de um emprestimo[S/N]: ");
					    	emprestimo = input.next().charAt(0);							
					    	if (emprestimo == 'S' ||emprestimo == 's') {
					    		do {
						    		System.out.println("Valor do emprestimo: R$");
							    	valorEmprestimo = input.nextFloat();
							    	
							    	if(valorEmprestimo <= cEmpresa.getEmprestimo()) {
							    		cEmpresa.pedirEmprestimo(valorEmprestimo);
							    		flagEmprestimo = true;
							    	}
							    	else
							    	{
							    		System.out.println("VALOR INVALIDO");
							    		System.out.printf("Emprestimo disponivel: R$%.2f\n",cEmpresa.getEmprestimo());
							    		flagEmprestimo = false;					    		
							    	}
							    	
					    		}while(flagEmprestimo == false);
					    		cEmpresa.visualizar();	
					    	}
			    		}
			    	}while(emprestimo == 'S' ||emprestimo == 's');	
				    System.out.println("FINALIZANDO operação ...");
		    		
				    cEmpresa.visualizar();	
			    	countMovimento = 0;
			        break;
			        
			    case 5:			    	
			    				    	
			       	ContaEstudantil cEstudantil = new ContaEstudantil(codConta,cpf,saldo,statusConta);		    	
			    	System.out.println("\n\n");
			       
			    	do{
				    	do {
				    		System.out.println("Movimento [D / C]: ");
					    	movimento = input.next().charAt(0);					    	
				    	}while ((movimento != 'D' && movimento != 'd') && (movimento != 'C' && movimento != 'c'));	
				    	
				    	do{
				    		System.out.println("Valor: R$");			    	
				    	    valorMovimento = input.nextFloat();		
				    	    if (movimento == 'D' || movimento == 'd') {
				    		    aux = cEstudantil.debito(valorMovimento);
				    	    }
				    	 }while(aux == false);			    			
				    	 
				    	if (movimento == 'C' || movimento == 'C') {
				    		cEstudantil.credito(valorMovimento);
				    	}
				    	
				    	countMovimento++;	
				    	
				    	do {			    		
				    		System.out.println("Continuar [S / N]: ");
				    		continuar = input.next().charAt(0);							    					    	
				    	}while ((continuar != 'S' && continuar != 's') && (continuar != 'N' && continuar != 'n'));
				    	
				    	if(countMovimento == 10) {
				    		System.out.println("Limite de movimentação diaria atingido");
				    		System.out.println("FINALIZANDO operação ...");
				    		continuar = 'n';
				    	}			    	
			    	}while ((continuar == 'S' || continuar == 's') && (countMovimento < 10));
			    	
			    	System.out.println();
			    	cEstudantil.visualizar();	
			    	System.out.println();
			    	
				    
		    		if (cEstudantil.getLimite() != 0) {
		    			do {
				    		System.out.println("Você ainda tem limite disponível");
					    	System.out.println("Gostaria de usa-lo [S/N]: ");
					    	usarLimite = input.next().charAt(0);							
					    	if (usarLimite == 'S' || usarLimite == 's') {
					    		do{
					    			System.out.println("Valor: R$");
					    			valorLimite = input.nextFloat();
						    		aux = cEstudantil.debito(valorLimite);
					    		}while (aux == false);
					    		cEstudantil.visualizar();	
					    	}	
					    }while(usarLimite == 'S' || usarLimite == 's' && cEstudantil.getLimite() != 0);			    		
			    	}			    	
			    	System.out.println("FINALIZANDO operação ...");		    		
			    	
		    	    countMovimento = 0;
			        break;    	
			} 		
			
		} while(option!=6);
		System.out.println("OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS");
		
	}	
}