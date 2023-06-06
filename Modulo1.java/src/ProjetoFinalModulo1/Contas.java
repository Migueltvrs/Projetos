package ProjetoFinalModulo1;
import java.util.Scanner;

public abstract class Contas {
	
	Scanner sc = new Scanner(System.in);
	
	private int numeroDaConta;
	private String nomeDoTitular;
	private double saldoDisponivel;
	
	
	public abstract void dadosContaCadastrada();
	public abstract void deposito(double valor);
	public abstract void saque(double valor);
	
	
	public void novoCadastro() {
		System.out.println("Informe um número para a sua conta: ");
		this.numeroDaConta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o nome do titular da conta: ");
		this.nomeDoTitular = sc.nextLine();
		
		System.out.println("Informe um valor inicial para abrir a sua conta: ");
		this.saldoDisponivel = sc.nextDouble();
		
		System.out.println();
	}
	
	
	
	public void exibirSaldo() {
		System.out.printf("Saldo disponível: R$ %.2f \n", this.saldoDisponivel);
		System.out.println("--------------------");
		System.out.println();
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	
	public void setSaldoDisponivel(double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}


}