//Crie uma classe "Pessoa" com os atributos "nome" e "idade". 
//Implemente um método estático chamado "compararIdade" que receba dois objetos "Pessoa" como parâmetros... 
//...e retorne true se a primeira pessoa for mais velha do que a segunda, e false caso contrário.

package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
	
		PessoaObj pessoa1 = new PessoaObj("Fulano", 20);
		PessoaObj pessoa2 = new PessoaObj("Fulana", 4);
		
		boolean comparacao = PessoaObj.compararIdade(pessoa1, pessoa2);
		
		if(comparacao) {
			System.out.println(pessoa1.getNome() + " é mais velho(a) que " + pessoa2.getNome());
		} else {
			System.out.println(pessoa2.getNome() + " é mais velho(a) que " + pessoa1.getNome());
		}
		
		
		
		

	}

}
