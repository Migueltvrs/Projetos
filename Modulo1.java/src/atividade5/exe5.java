/*5) Declarar dois vetores com capacidade para armazenar 10(dez) números inteiros cada um. 
 *   Declarar um terceiro vetor que receba a soma dos outros dois vetores.
 */

package atividade5;

import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] vetor3 = new int[10];
		
		//valores vetor1
		for(int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite o valor da posição " + i + " para o vetor1: ");
			vetor1[i] = scanner.nextInt();
		}
		
		//valores vetor2
		for(int i = 0; i < vetor2.length; i++) {
			System.out.println("Digite o valor da posição " + i + " para o vetor2: ");
			vetor2[i] = scanner.nextInt();
		}
		
		//definindo valor do vetor 3
		for(int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			
		}
		
		//imprimindo valores de vetor1
		System.out.println("Os valores do vetor1 são: ");
		for(int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + " ");
		}
	    
		//imprimindo valores de vetor2
		System.out.println("\n" + "Os valores do vetor2 são: ");
		for(int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + " ");
		}
		
		//imprimindo valores de vetor3
		System.out.println("\n" + "Os valores do vetor3 são: ");
		for(int i = 0; i < vetor3.length; i++) {
			System.out.print(vetor3[i] + " ");
		}
		
		scanner.close();
	}

}
