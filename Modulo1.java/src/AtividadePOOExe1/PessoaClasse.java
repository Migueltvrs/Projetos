/*1) Crie uma classe chamada "Pessoa" que tenha os seguintes atributos: nome, idade e profissão. 
 *   Em seguida, crie um método chamado "apresentar" que imprime uma mensagem na tela com o nome, idade e profissão da pessoa. 
     Crie uma classe com o método main que cria objeto para duas pessoas e chame o método "apresentar" para cada uma delas.
 */

package AtividadePOOExe1;

public class PessoaClasse {

	public static void main(String[] args) {

		PessoaObjeto pessoa = new PessoaObjeto();
		
		//pessoa1
		pessoa.apresentar("Miguel", 31, "Programador");
		
		//pessoa2
		pessoa.apresentar("Fulano", 100, "Engenheiro");
		
	}

}
