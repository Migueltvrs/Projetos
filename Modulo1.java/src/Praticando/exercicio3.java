// Faça um programa que solicite ao usuário um número e imprima todos os números pares entre 0 e o número informado.

package Praticando;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		for(int i = 0; i <= numero; i++) {
			if(i % 2 == 0 ) {
				System.out.println(i);
			}
			
		}

	}

}
