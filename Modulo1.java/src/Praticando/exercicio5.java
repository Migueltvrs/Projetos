// Faça um programa que solicite ao usuário um número e imprima a sequência de Fibonacci até esse número.

package Praticando;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número desejado: ");
		int numero = scanner.nextInt();
		
		int anterior = 0;
		int atualFibonacci = 1;
		
		
		for(int i = 1; atualFibonacci <= numero; i++) {
			System.out.println(atualFibonacci);
			
			int proximo = anterior + atualFibonacci;
			anterior = atualFibonacci;
			atualFibonacci = proximo;
		

		}

	}

}

