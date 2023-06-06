//Crie uma classe chamada "Livro" que tenha os seguintes atributos: título, autor, e anoPublicacao. 
//A classe deve ter um construtor que receba esses três valores como parâmetros e os atribua aos respectivos atributos. 
//Crie também um método chamado "exibirInformacoes" que imprima as informações do livro.


package Livro;

public class LivroObj {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	
	public LivroObj(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = ano;
		
	}
	
	
	void exibirInformacoes() {
		System.out.println("Título do livrro: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano de publicação: " + this.anoPublicacao);
	}
	

}
