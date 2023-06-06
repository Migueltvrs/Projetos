package ProjetoFinalModulo1;


public class ContaPoupanca extends Contas {
	
    @Override
    public void saque(double valor) {
        System.out.println("Operação inválida. Utilize o método 'resgatar()'.");
        System.out.println("--------------------");
        System.out.println();
    }

    
	@Override
	public void deposito(double valor) {
	    System.out.println("Operação inválida. Utilize o método 'aplicar()'.");
	    System.out.println("--------------------");
	    System.out.println();
	    }
	
	
	@Override
	public void dadosContaCadastrada() {
		System.out.printf("Número Conta Poupança: %d \n", getNumeroDaConta());
		System.out.printf("Nome: %s \n", this.getNomeDoTitular());
		System.out.printf("Saldo: R$ %.2f \n", this.getSaldoDisponivel());
		System.out.println("--------------------");
		System.out.println();
	}

	
	public void resgatar (double valor, ContaCorrente cc) {
		if(getSaldoDisponivel() >= valor){
			setSaldoDisponivel(getSaldoDisponivel() - valor);
			cc.setSaldoDisponivel(cc.getSaldoDisponivel() + valor);
			System.out.printf("Resgate no valor de R$ %.2f efetuado com sucesso. \n", valor);
			System.out.println("--------------------");
			System.out.println();
		}else{
			System.out.println("Saldo insuficiente para realizar essa operação.");
			System.out.println("--------------------");
			System.out.println();
		}
		
	}
	
	    
}
	
