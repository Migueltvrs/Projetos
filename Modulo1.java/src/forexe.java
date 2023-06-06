
import java.util.Scanner;

public class forexe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o valor: ");
		int numero = scanner.nextInt();
		
		numero = numero * 2;
		
		for (int i = 0; i < numero; i++) {
			
			System.out.println(nome);
		}

	}

}
