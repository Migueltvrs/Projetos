// 2) Crie um algoritmo que receba do usuário um número qualquer e verifique se esse número é múltiplo de 5.
package atividade2;

import java.util.Scanner;

public class atividade2Exe2 {

	public static void main(String[] args) {
		
		Scanner multiplo5 = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = multiplo5.nextInt();
		
		if (numero % 5 == 0) {
			
			System.out.println("O número: " + numero + " é múltiplo de 5");
			
		} else {
			
			System.out.println("O número: " + numero + " não é múltiplo de 5");
		}
	}
}
