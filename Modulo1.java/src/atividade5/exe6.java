/*6)  Criar um vetor que receba 4 notas de um aluno, 
	  calcule a média dessas notas e verificar se o aluno foi aprovado, está em recuperação ou foi reprovado. 
	  A média de 7 até 10 o aluno é APROVADO. 
	  A média de 3 até 6.9 o aluno vai para RECUPERAÇÃO e a
	  média menor que 3 o aluno é REPROVADO.*/

package atividade5;
import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double[] notas = new double[4];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite o valor da nota: " + (i + 1));
			notas[i] = scanner.nextDouble();		
			
		}
		
		//somando notas
		
		double soma = 0;
		
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		//definndo situação do aluno
		
		double media = soma / notas.length;
		
		if(media >= 7) {
			System.out.printf("O aluno foi aprovado com a média: %f", media);
			
		} else if (media >= 3) {
			System.out.printf("O aluno está de recuperação com a média: %f", media);
			
		} else {
			System.out.printf("O aluno foi reprovado com a média: %f", media);
		}
		
		scanner.close();
	}
}
