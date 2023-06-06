package Aulas;
import java.util.Scanner;

public class aulaWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 à 7: ");
		int i = scanner.nextInt();
		
		if(i > 7 || i < 1) {
			
			System.out.println("Tentando burlar o sistema, malandro? O.o");	
		}
		
		while(i != 0) {
			
			switch (i){
			
			case 1:
				System.out.println("Domingo");
				break;
				
			case 2:
				System.out.println("Segunda-Feira");
				break;
			
			case 3:
				System.out.println("Terça-feira");
				break;
				
			case 4: 
				System.out.println("Quarta-feira");
				break;
				
			case 5 :
				System.out.println("Quinta-feira");
				break;
				
			case 6:
				System.out.println("Sexta-feira");
				break;
			
			case 7:
				System.out.println("Sábado");
				break;
				
			default:
				System.out.println("O número digitado não é válido.");
			
			
		}
		
			System.out.println("\n" + "Digite um número de 1 à 7: ");
			i = scanner.nextInt();
		
	}
	}
}
