/*1) Crie uma classe chamada "Pessoa" que tenha os seguintes atributos: nome, idade e profissão. 
 *   Em seguida, crie um método chamado "apresentar" que imprime uma mensagem na tela com o nome, idade e profissão da pessoa. 
 *   Crie uma classe com o método main que cria objeto para duas pessoas e chame o método "apresentar" para cada uma delas.
 */

package AtividadePOOExe1;

public class PessoaObjeto {
	
//	String nome;
//	int idade;
//	String profissao;
	
	
	void apresentar(String nome, int idade, String profissao) {
		System.out.printf("Nome: %s \nIdade: %d \nProfissão: %s\n\n", nome, idade, profissao);
		
	}
	
}
