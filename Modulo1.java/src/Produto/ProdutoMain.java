//Crie uma classe chamada "Produto" que tenha os seguintes atributos: nome, preço e quantidade. 
//A classe deve ter um construtor que receba o nome e o preço como parâmetros e inicialize a quantidade como 0. 
//Crie métodos para aumentar e diminuir a quantidade do produto. 
//Crie também um método chamado "exibirInformacoes" que imprima as informações do produto.


package Produto;

public class ProdutoMain {

	public static void main(String[] args) {
		
		ProdutoObj produto = new ProdutoObj("Celular", 2000, 0);
		produto.exibirInformacoes();
		produto.aumentarProduto(10);
		produto.pulaLinha();
		produto.exibirInformacoes();
		produto.pulaLinha();
		produto.diminuirProduto(7);
		produto.exibirInformacoes();
		
	}

}
