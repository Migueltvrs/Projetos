//4) Declarar um vetor de inteiros e imprimir o menor e maior valor do vetor.

package atividade5;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanhoVetor = scanner.nextInt();
		
		int[] valores = new int[tamanhoVetor];
		
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			valores[i] = scanner.nextInt();
			
		}
		
		int maior = valores[0]; //após definir os valores do vetor.
		int menor = valores[0];
		
		
		for(int i = 0; i < valores.length; i++) {
			if (valores[i] < menor ) {
				menor = valores[i];
				
			} 
			
			if(valores[i] > maior) {
				maior = valores[i];
			}
		}
		
		System.out.printf("o menor valor digitado foi: %d \n", menor);
		System.out.printf("o maior valor digitado foi: %d", maior);
		
		
		scanner.close();
	}

}
