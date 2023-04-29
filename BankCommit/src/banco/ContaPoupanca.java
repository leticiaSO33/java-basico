package banco;

public class ContaPoupanca extends Conta {
	private int diaAniversario;
	
	 public  ContaPoupanca(int codConta, String cpf, float saldo, boolean statusConta) {
         super(codConta, cpf, saldo, statusConta);        
     }
	 
	 public void correcao(int dataConta) {                        
		 if (dataConta == this.diaAniversario) {			 
			 this.saldo += (this.saldo * 0.05);                           
			 System.out.printf("Saldo corrigido - %.2f\n",this.saldo);
		 }
		 else {
			 System.out.println("Data da conta e dia do aniversario divergentes");
			 System.out.printf("Correção não efetuada -  %.2f\n",this.saldo);			 
		 }		 
	 } 
	 
	 @Override
	 public void visualizar() {
		super.visualizar();		
		System.out.println("Dia do aniversario: " + this.diaAniversario);
		System.out.print("\n\n");
		}
	 
	public int getDiaAniversario() {
		return diaAniversario;
	}	
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	 
	 
}
