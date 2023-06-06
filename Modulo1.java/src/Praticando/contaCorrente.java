package Praticando;

public class contaCorrente {

	String correntista;
	double saldo;
	
	
// void = não retorna(não pode utilizar o seu retorno) nada, int, double, String
	
	
	void sacar(double valor){
		if(saldo >= valor) {
			this.saldo -= valor;
			
		} else {
			System.out.println("Saldo insuficiente para efetuar o saque.");
			
		}
		
	
	}
	
	
	void depositar(double valor) {
		this.saldo += valor;
		
	}
	
	
	
	
	
}
