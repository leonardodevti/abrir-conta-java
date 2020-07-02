package aplicacao;

import java.util.Scanner;

import entidade.ContaBancaria;

/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

public class Programa {

	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);
	
	ContaBancaria contaBancaria; 
	
	
	System.out.println("Informe o Número da Conta: ");
	int nConta = ent.nextInt(); 
	
	
	System.out.println("Informe o Nome do Cliente: ");
	ent.nextLine(); //Para consumir a quebra de linha, pois antes desse dado String, vem um dado int.
	String nomeCliente = ent.nextLine();
	

	System.out.println("Deseja Fazer um Depósito Inicial? Informe s para Sim ou n para Não:");
	char resp = ent.next().charAt(0); 
	
	
	
	//Estrutura de repetição para o caso de o usuário digitar um caractere inválido.
	while (resp != 's' && resp != 'n')	{ 
		System.out.println("Valor Inválido!");
		resp = ent.next().charAt(0);
	}
	
	//Estrutura de decisão para saber qual construtor usar:
	if (resp == 's') {
			System.out.println("Informe o Valor do Depósito Inicial: ");
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
	System.out.println("Informe o Valor que Será Depositado: ");
	double deposito = ent.nextDouble();
	contaBancaria.deposito(deposito);
	
	System.out.println();
	System.out.println("Informe o Valor que Será Sacado: ");
	double saque = ent.nextDouble();
	contaBancaria.saque(saque);
	
	System.out.println("Dados da Conta Atualizados: Nome: " + contaBancaria);
	
		
	ent.close();
	}

}
