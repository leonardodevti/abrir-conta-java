package entidade;

public class ContaBancaria {

	private int nConta;
	private String nomeCliente;
	private double saldo;
	
	//Criando um construtor com 2 parâmetros.  Para o caso de  NÃO ter um depósito inicial.
	public ContaBancaria(int nConta, String nomeCliente) {
		this.nConta = nConta;
		this.nomeCliente = nomeCliente;
	}
	
	//Criando um construtor com 3 parâmetros. Para o caso de ter um depósito inicial, foi acrescentado o parâmetro "depositoInicial".
	public ContaBancaria(int nConta, String nomeCliente, double depositoInicial) {
		this.nConta = nConta;
		this.nomeCliente = nomeCliente;
		deposito(depositoInicial); //Função "depósito" com "depositoInicial" como parâmetro.
	}

	//Usando gets e sets nos atributos.
	
	public int getnConta() { //Permitindo apenas pegar o atributo, mas não alterá-lo.
		return nConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getsaldo() { //Permitindo apenas pegar o atributo, mas não alterá-lo.
		return saldo;
	}

	
	public void deposito(double quantia) { 
		saldo += quantia;
	}
	
	public void saque(double quantia) { 
		saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return 
			nomeCliente
			+ ", Conta: "
			+ nConta
			+ ", Saldo: R$"
			+ String.format("%.2f", saldo);
				
	}
	
}
