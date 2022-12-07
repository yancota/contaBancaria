package entidades;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public Conta(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroCOnta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		this.saldo -= valor + 5;
	}

	public void exibir() {
		System.out.println("Conta: " + numeroConta);
		System.out.println("Nome: " + nomeTitular);
		System.out.println("Saldo: " + saldo);
	}
}
