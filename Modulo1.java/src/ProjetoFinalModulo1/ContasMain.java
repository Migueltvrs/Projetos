package ProjetoFinalModulo1;

public class ContasMain {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();
		
		
		cc.novoCadastro();
		cp.novoCadastro();
		System.out.println();
		
		cc.dadosContaCadastrada();
		cp.dadosContaCadastrada();
		
		cc.aplicar(7000, cp);
		
		cc.dadosContaCadastrada();
		cp.dadosContaCadastrada();
		

	}
}
