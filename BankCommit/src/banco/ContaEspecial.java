package banco;

public class ContaEspecial extends Conta {
	private float limite;

	public ContaEspecial(int codConta, String cpf, float saldo, boolean statusConta) {
		super(codConta, cpf, saldo, statusConta);
		this.limite = 1000;		
	}

	@Override
	public boolean debito(float valor) {
		if((this.saldo + this.limite) < valor) {			
			System.out.printf("Saldo insuficiente. Saldo atual R$%.2f\n",this.saldo);
			System.out.printf("Limite disponível: R$%.2f\n",this.limite);
			return false;
	    }
		
		float aux = this.saldo - valor;
		
		if (aux >= 0) {
			this.saldo = aux;
		}
		else {
			this.limite = this.limite + (this.saldo - valor);
			this.saldo = 0;
		}
		return true;
	}       
	       
	
	@Override
	 public void visualizar() {
		super.visualizar();
		System.out.println("Limite restante: " + this.limite);
		System.out.print("\n\n");
		}	
	
	
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
}
