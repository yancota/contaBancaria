package principal;

import java.util.*;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double saldo;
		String nomeTitular;
		int numeroConta;
		Conta conta;

		System.out.print("Digite o número da nova conta bancária: ");
		numeroConta = input.nextInt();

		System.out.print("Insira o nome do titular: ");
		nomeTitular = input.next();

		System.out.print("Deseja começar a conta depositando um valor? (s/n)?");
		char condicao = input.next().charAt(0);

		if (condicao == 's') {
			System.out.print("Insira o valor que deseja depositar: ");
			saldo = input.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, saldo);
		} else {
			conta = new Conta(numeroConta, nomeTitular);
		}

		System.out.print("Realize um depósito: ");
		conta.depositar(input.nextDouble());
		conta.exibir();
		System.out.println("Realize um saque: ");
		conta.saque(input.nextDouble());
		conta.exibir();

		input.close();

	}
}