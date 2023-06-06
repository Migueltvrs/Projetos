/*Classe "Livro":

Atributos:
Título do livro.
Um objeto da classe "Autor" que representa o autor do livro.
Ano de publicação do livro.

Métodos:
Um construtor que receba o título, o autor (objeto da classe "Autor") e o ano de publicação do livro.
Métodos getters para obter o título, autor e ano de publicação do livro.*/

package Praticando;

public class Livro {
	
	 String tituloLivro;
	 String Nomeautor;
	 int anoPublicacao;
	
	
	private Livro(String titulo, String autor, int ano){
		this.tituloLivro = titulo;
		this.Nomeautor = autor;
		this.anoPublicacao = ano;
		
	}

//getter e setter
	public String getTituloLivro() {
		return tituloLivro;
	}


	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}


	public String getNomeautor() {
		return Nomeautor;
	}


	public void setNomeautor(String nomeautor) {
		Nomeautor = nomeautor;
	}


	public int getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	

}
