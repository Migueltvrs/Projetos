//Crie uma classe "Aluno" com os atributos "nome" e "nota". 
//Em seguida, crie um vetor de objetos dessa classe e preencha-o com alguns alunos e suas respectivas notas. 
//Calcule a média das notas e exiba o nome dos alunos que possuem nota acima da média.


package Alunoo;

public class AlunoObj {
	
	private String nome;
	private double nota;
	

	public AlunoObj(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}


}
