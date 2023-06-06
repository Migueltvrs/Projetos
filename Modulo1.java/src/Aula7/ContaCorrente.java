package Aula7;

public class ContaCorrente {
	
	int numeroDaConta;
	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	String titular;
	private double saldo;
	
	
	//método construtor. nome da classe e não tem retorno
	public ContaCorrente(int conta, String nome, double valor){
		this.numeroDaConta = conta;
		this.titular = nome;
		this.saldo = valor;
	
	}
	


	void sacar(double valor) {
		this.saldo -= valor;
		System.out.println(this.saldo);
		
	}
	
	
	void depositar(double valor) {
		this.saldo += valor;
		System.out.println(this.saldo);
		
	}
	
}
