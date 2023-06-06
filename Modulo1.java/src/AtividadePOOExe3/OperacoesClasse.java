/*3) Criar uma classe que possua um método para cada operação: somar, subtrair, multiplicar e dividir dois números. 
 *   Criar uma classe com o método main e fazer as chamadas dos métodos.
 */

package AtividadePOOExe3;

public class OperacoesClasse {

	public static void main(String[] args) {
		
		OperacoesObjeto operacoes = new OperacoesObjeto();
		
		//soma
		double somaResultado = operacoes.somar(100, 10);
		System.out.println("O valor da adição é: " + somaResultado);
		
		//subtrção
		double subtracaoResultado = operacoes.subtrair(100, 10);
		System.out.println("O valor da subtração é: " + subtracaoResultado);
		
		//multiplicação
		double multiplicacaoResultado = operacoes.multiplicar(100, 10);
		System.out.println("O valor da multiplicação é: " + multiplicacaoResultado);
		
		//divisão
		double divisaoResultado = operacoes.dividir(100, 10);
		System.out.println("O valor da divisão é: " + divisaoResultado);
			
		
	}

}
