package banco;

public class ContaCorrente extends Conta {
	private int qtdCheques;

	public ContaCorrente(int codConta, String cpf, float saldo, boolean statusConta) {
		super(codConta, cpf, saldo, statusConta);	
		qtdCheques =0;
	}
	
	public void pedirTalao() {		
		this.saldo = this.saldo - (30 * qtdCheques);
		System.out.printf("NOVO SALDO   %.2f\n",this.saldo);			 
	}
	
	@Override
	 public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de Cheques: " + this.qtdCheques);
		System.out.print("\n\n");
		}	

	public int getQtdCheques() {
		return qtdCheques;
	}
	public void setQtdCheques(int qtdCheques) {
		this.qtdCheques = qtdCheques;
	}
	
	

}
