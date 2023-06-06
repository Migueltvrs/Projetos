//Crie uma classe chamada "Produto" que tenha os seguintes atributos: nome, preço e quantidade. 
//A classe deve ter um construtor que receba o nome e o preço como parâmetros e inicialize a quantidade como 0. 
//Crie métodos para aumentar e diminuir a quantidade do produto. 
//Crie também um método chamado "exibirInformacoes" que imprima as informações do produto.

package Produto;

public class ProdutoObj {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public ProdutoObj(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		
	}
	
	public int aumentarProduto(int quantidade) {
		return this.quantidade += quantidade;
		
	}
	
	
	public int diminuirProduto(int quantidade) {
		return this.quantidade -= quantidade;
		
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preco);
		System.out.println("Quantidade: " + this.quantidade);
		
	}
	
	public void pulaLinha() {
		System.out.println("------------------------------------");
		
	}

}
