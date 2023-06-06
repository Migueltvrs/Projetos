package Aula7;
import java.util.Scanner;

public class ContaCorrenteMain {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1792, "Sr. Fulano", 20000);
		Scanner scanner = new Scanner(System.in);
		
//		cc.numeroDaConta = 1792;
//		cc.titular = "Sr. Fulano";
//		cc.saldo = 20000;
		
		
		System.out.println(cc.getSaldo());
		
		cc.sacar(1000);
		cc.depositar(3000);
		

	}

}
