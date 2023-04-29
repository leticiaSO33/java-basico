package banco;

public class ContaEmpresa extends Conta{
	private float emprestimo;

	public ContaEmpresa(int codConta, String cpf, float saldo, boolean statusConta) {
		super(codConta, cpf, saldo, statusConta);
		this.emprestimo = 10000;		
	}

	public void pedirEmprestimo(float valor) {
		if (emprestimo <= 10000) {
			this.saldo += valor;
			this.emprestimo -= valor;
			System.out.printf("Novo saldo: %.2f\n",this.saldo);
			System.out.printf("Emprestimo disponível: %.2f\n",this.emprestimo);
		}
		
				
	}
	
	@Override
	 public void visualizar() {
		super.visualizar();
		System.out.println("Emprestimo disponível: " + this.emprestimo);
		System.out.print("\n\n");
		}	
	
	
	public float getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(float emprestimo) {
		this.emprestimo = emprestimo;
	}
		
	
	


}
