package Praticando;

public class banco {

	public static void main(String[] args) {

		contaCorrente cc = new contaCorrente();
		
		cc.correntista = "Diogo";
		
		cc.saldo = 200 ;
		System.out.println("Saldo " + cc.saldo);
		
		cc.sacar(100);
		System.out.println("Saldo " + cc.saldo);
		
		
		
		contaCorrente cc2 = new contaCorrente();
		
		cc2.correntista = "Miguel";
		cc2.saldo = 200;
		
		
		
	}

}




/*capsulamento
herança
polimorfismo

método = função*/