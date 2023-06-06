//Crie uma classe chamada "Aluno" que tenha os seguintes atributos: nome, matricula e curso. 
//A classe deve ter um construtor que receba esses três valores como parâmetros e os atribua aos respectivos atributos. 
//Crie também um método chamado "exibirInformacoes" que imprima as informações do aluno.

package Aluno;

public class AlunoMain {

	public static void main(String[] args) {
		
		AlunoObj aluno = new AlunoObj("Diogo Miguel Tavares Gouveia", 2023, "Engenharia de software");
		aluno.exibirInformacoes();
		
		System.out.println("----------------------------------");
		
		AlunoObj aluno2 = new AlunoObj("Ana Maria Tavares", 2023, "Administração");
		aluno2.exibirInformacoes();
		
	}

}
