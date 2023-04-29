package banco;

public abstract class Conta {                                       
	protected int codConta;
	protected String cpf;
	protected float saldo;
	protected boolean statusConta;
	
	
	public Conta(int codConta, String cpf, float saldo, boolean statusConta) {
	       this.codConta = codConta;
	       this.cpf = cpf;
	       this.saldo = saldo;
	       this.statusConta = statusConta;
	    }
	
	
	public boolean debito(float valor) {
        if (saldo < valor) {        	
        	System.out.printf("Saldo insuficiente. Saldo atual R$%.2f\n",saldo);
        	return false;
        }
        else {
        	saldo -= valor;
            return true;
        } 
    }	
	
	public void credito(float valor) {
		this.saldo += valor;
	}
	
	public void visualizar() {
		System.out.println("RESUMO");
		System.out.println("======");				
		System.out.println("Conta: " + this.codConta);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Situação da conta:" + this.statusConta);
		System.out.println("SALDO: " + this.saldo);		
	}
	
	
	public int getcodConta() {
		return codConta;
	}
	public String getCpf() {
		return cpf;
	}
	public float getSaldo() {
		return saldo;
	}
	public boolean getstatusConta() {
		return statusConta;
	}	
	public void setcodConta(int codConta) {
		this.codConta = codConta;
	}	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}	
	public void setstatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}
	
	

}
