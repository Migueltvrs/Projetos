//Crie uma classe "Aluno" com os atributos "nome" e "nota". 
//Em seguida, crie um vetor de objetos dessa classe e preencha-o com alguns alunos e suas respectivas notas. 
//Calcule a média das notas e exiba o nome dos alunos que possuem nota acima da média.

package Alunoo;

public class AlunoMain {

	public static void main(String[] args) {
		
		AlunoObj[] alunos = new AlunoObj[3];
		
		alunos[0] = new AlunoObj("Diogo", 10);
		alunos[1] = new AlunoObj("Miguel", 7);
		alunos[2] = new AlunoObj("Fulaninho", 4
				);
		
		
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].getNome());
			System.out.println(alunos[i].getNota());
			System.out.println("-------------------");
			
		}
		
		double media = ((alunos[0].getNota() + alunos[1].getNota() + alunos[2].getNota()) / alunos.length) ;
		System.out.println("A média geral é: " + media);
		
		

	}

}
