/* 4)  Faça um programa para verificar se um aluno vai ser aprovado ou não na disciplina de Java e Orientação a Objetos. 
 *     Solicite ao usuário o nome e as duas notas que o aluno tirou na prova e calcule a média aritmética.
 *      - Média estiver entre 7.0 e 10.0, mostrar a mensagem que o aluno está Aprovado;
        - Média entre 3.0 e 6.9 de Recuperação;
  		- Média menor que 3.0 está Reprovado.
 */

package atividade3;
import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = scanner.nextLine();
		
		System.out.printf("Digite a primeira nota de %s: ", nome);
		double nota1 = scanner.nextDouble();
		
		System.out.printf("Digite a segunda nota de %s: ", nome);
		double nota2 = scanner.nextDouble();
		
		double mediaAritimetica = (nota1 + nota2) / 2;
		
		if (mediaAritimetica >= 7) {
			
			System.out.printf("%s foi aprovado(a) com a média: %f", nome, mediaAritimetica);
			
		} else if (mediaAritimetica >= 3) {
			
			System.out.printf("%s está em recuperação com a média: %f", nome, mediaAritimetica);
			
		} else {
			
			System.out.printf("%s foi reprovado(a) com a média: %f", nome, mediaAritimetica);
		}
	}
}
