// Faça um programa que solicite ao usuário um número e imprima a tabuada desse 

package Praticando;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número desejado: ");
		int numero = scanner.nextInt();
		
		
		for (int contador = 1; contador < 10; contador++ ) {
			
			System.out.println(numero * contador);
		}

	}

}
