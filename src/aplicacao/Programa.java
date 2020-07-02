package aplicacao;

import java.util.Scanner;

import entidade.ContaBancaria;

/*Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do
titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito
inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua
conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.
Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J�
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por
exemplo).
Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger
isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for
suficiente para realizar o saque e/ou pagar a taxa.
Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o
informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre
mostrando os dados da conta ap�s cada opera��o.*/

public class Programa {

	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);
	
	ContaBancaria contaBancaria; 
	
	
	System.out.println("Informe o N�mero da Conta: ");
	int nConta = ent.nextInt(); 
	
	
	System.out.println("Informe o Nome do Cliente: ");
	ent.nextLine(); //Para consumir a quebra de linha, pois antes desse dado String, vem um dado int.
	String nomeCliente = ent.nextLine();
	

	System.out.println("Deseja Fazer um Dep�sito Inicial? Informe s para Sim ou n para N�o:");
	char resp = ent.next().charAt(0); 
	
	
	
	//Estrutura de repeti��o para o caso de o usu�rio digitar um caractere inv�lido.
	while (resp != 's' && resp != 'n')	{ 
		System.out.println("Valor Inv�lido!");
		resp = ent.next().charAt(0);
	}
	
	//Estrutura de decis�o para saber qual construtor usar:
	if (resp == 's') {
			System.out.println("Informe o Valor do Dep�sito Inicial: ");
			double depositoInicial = ent.nextDouble();
			contaBancaria  = new ContaBancaria(nConta, nomeCliente, depositoInicial);
	}
	else {
			contaBancaria = new ContaBancaria(nConta, nomeCliente); 
	}


	System.out.println();
	System.out.println("Dados da Conta: ");
	System.out.println("Nome: " + contaBancaria); //Imprimindo os dados da conta.
	
	System.out.println();
	System.out.println("Informe o Valor que Ser� Depositado: ");
	double deposito = ent.nextDouble();
	contaBancaria.deposito(deposito);
	
	System.out.println();
	System.out.println("Informe o Valor que Ser� Sacado: ");
	double saque = ent.nextDouble();
	contaBancaria.saque(saque);
	
	System.out.println("Dados da Conta Atualizados: Nome: " + contaBancaria);
	
		
	ent.close();
	}

}
