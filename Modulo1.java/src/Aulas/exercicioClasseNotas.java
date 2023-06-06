package Aulas;
import java.util.Scanner;

public class exercicioClasseNotas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o nome o nome do aluno: ");
		String nome = scanner.nextLine();                       
			
		System.out.println("Valor da primeira nota: ");
		double nota1 = scanner.nextDouble();                    
		
		System.out.println("Valor da segunda nota: ");
		double nota2 = scanner.nextDouble();                    
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			
			System.out.println("A média do aluno foi: " + media + ". O aluno foi APROVADO");
			
		} else if (media >= 3) {
			
			System.out.println("A média do aluno foi: " + media + ". O aluno ficou de RECUPERAÇÃO");
			
		} else {
			
			System.out.println("A média do aluno foi: " + media + ". O aluno foi REPROVADO");
			
		}
	}
}
