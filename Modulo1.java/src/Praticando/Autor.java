/*Classe "Autor":

Atributos:
Nome do autor.

Métodos:
Um construtor que receba o nome do autor.
Um método getter para obter o nome do autor.*/

package Praticando;

public class Autor {
	
	String nomeAutor;
	
	private  Autor(String nome) {
		this.nomeAutor = nome;
		
	}
	
	
//getter e setter
	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	

}
