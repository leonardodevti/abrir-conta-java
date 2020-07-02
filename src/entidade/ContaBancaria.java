package entidade;

public class ContaBancaria {

	private int nConta;
	private String nomeCliente;
	private double saldo;
	
	//Criando um construtor com 2 par�metros.  Para o caso de  N�O ter um dep�sito inicial.
	public ContaBancaria(int nConta, String nomeCliente) {
		this.nConta = nConta;
		this.nomeCliente = nomeCliente;
	}
	
	//Criando um construtor com 3 par�metros. Para o caso de ter um dep�sito inicial, foi acrescentado o par�metro "depositoInicial".
	public ContaBancaria(int nConta, String nomeCliente, double depositoInicial) {
		this.nConta = nConta;
		this.nomeCliente = nomeCliente;
		deposito(depositoInicial); //Fun��o "dep�sito" com "depositoInicial" como par�metro.
	}

	//Usando gets e sets nos atributos.
	
	public int getnConta() { //Permitindo apenas pegar o atributo, mas n�o alter�-lo.
		return nConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getsaldo() { //Permitindo apenas pegar o atributo, mas n�o alter�-lo.
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
