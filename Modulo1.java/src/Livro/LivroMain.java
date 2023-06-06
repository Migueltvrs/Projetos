package Livro;

public class LivroMain {

	public static void main(String[] args) {
		
		LivroObj livro = new LivroObj("Magic the Gathering", "Richard Garfield", 1990);
		livro.exibirInformacoes();
		
		System.out.println("----------------------------------");
		
		LivroObj livro2 = new LivroObj("Senhor dos aneis", "Desconhecido", 2000);
		livro2.exibirInformacoes();
		
	}

}
