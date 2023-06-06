//Crie uma classe "Pessoa" com os atributos "nome" e "idade". 
//Implemente um método estático chamado "compararIdade" que receba dois objetos "Pessoa" como parâmetros... 
//...e retorne true se a primeira pessoa for mais velha do que a segunda, e false caso contrário.

package Pessoa;

public class PessoaObj {
	
	private String nome;
	private int idade;
	private String pessoa1;
	private String pessoa2;
	
	
	public PessoaObj(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	
//comparador de idades
	public static boolean compararIdade(PessoaObj pessoa1, PessoaObj pessoa2) {
		return pessoa1.getIdade() > pessoa2.getIdade();
			
		}
		
	
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getPessoa1() {
		return pessoa1;
	}


	public void setPessoa1(String pessoa1) {
		this.pessoa1 = pessoa1;
	}


	public String getPessoa2() {
		return pessoa2;
	}


	public void setPessoa2(String pessoa2) {
		this.pessoa2 = pessoa2;
	}

		
	
	
}
