/*3) Criar um vetor que receba 10 (dez) números. 
	 Imprima os elementos do vetor na ordem que foram digitados e na ordem inversa.*/

package atividade5;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] valores = new int[10];
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			valores[i] = scanner.nextInt();
		}
		
		//Imprimindo na ordem
		
		System.out.println("Ordem direta: ");
		for(int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		
		//imprimindo na ordem inversa
		
		System.out.println("\n" + "Ordem inversa: ");
		for(int i = valores.length - 1; i >= 0; i--) {
			System.out.print(valores[i] + " ");
		
		}
		
		scanner.close();
	}
}