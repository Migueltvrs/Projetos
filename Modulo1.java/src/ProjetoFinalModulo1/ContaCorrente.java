package ProjetoFinalModulo1;


public class ContaCorrente extends Contas {
	
	@Override
	public void deposito(double valor) {
		this.setSaldoDisponivel(this.getSaldoDisponivel() + valor);
        System.out.printf("Depósito de: R$ %.2f efetuado com sucesso. \n", valor);
        System.out.println("--------------------");
        System.out.println();
	}
	
	@Override
	public void dadosContaCadastrada() {
		System.out.printf("Número Conta Corrente: %d \n", this.getNumeroDaConta());
		System.out.printf("Nome: %s \n", this.getNomeDoTitular());
		System.out.printf("Saldo: R$ %.2f \n", this.getSaldoDisponivel());
		System.out.println("--------------------");
		System.out.println();
	}

	@Override
	public void saque(double valor) {
		if(getSaldoDisponivel() >= valor) {
			setSaldoDisponivel(getSaldoDisponivel() - valor);
			System.out.printf("Saque no valor de: R$ %.2f efetuado com sucesso. \n", valor);
			System.out.println("--------------------");
			System.out.println();
		} else {
			System.out.println("Saldo insuficiente.");
			System.out.println("--------------------");
			System.out.println();
		}
	}
	
	
	public void aplicar(double valor, ContaPoupanca cp) {
		if (getSaldoDisponivel() >= valor) {
			setSaldoDisponivel(getSaldoDisponivel() - valor);
			cp.setSaldoDisponivel(cp.getSaldoDisponivel() + valor);
			System.out.printf("Valor de R$ %.2f aplicado com sucesso. \n", valor);
			System.out.println("--------------------");
			System.out.println();
		} else {
			System.out.println("Saldo indisponível para realizar aplicação.");
			System.out.println("--------------------");
			System.out.println();
		}
	}


}
