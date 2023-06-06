//Faça um programa que solicite ao usuário um número e imprima todos os seus divisores.

package Praticando;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("informe um número qualquer: ");
		int numero = scanner.nextInt();
		
		for(int i = 1; i <= numero ; i++) {
			
			if(numero % i == 0) {
				
				System.out.print(i + " ");
			}
		}

	}

}
