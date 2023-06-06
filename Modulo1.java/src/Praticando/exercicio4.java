// Faça um programa que solicite ao usuário um número e imprima todos os números ímpares entre 0 e o número informado.

package Praticando;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número desejado: ");
		int numero = scanner.nextInt();
		
		
		for(int i = 0; i <= numero; i++) {
			
			if(i % 2 != 0) {
				
				System.out.println(i);
			}
		}
	}
}
