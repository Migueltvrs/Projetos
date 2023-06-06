//Crie uma classe chamada "Aluno" que tenha os seguintes atributos: nome, matricula e curso. 
//A classe deve ter um construtor que receba esses três valores como parâmetros e os atribua aos respectivos atributos. 
//Crie também um método chamado "exibirInformacoes" que imprima as informações do aluno.

package Aluno;

public class AlunoObj {
	
	private String nome;
	private int matricula;
	private String curso;
	
	public AlunoObj(String nome, int matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	
	void exibirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Curso " + this.curso);
	}
	

}
