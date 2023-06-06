// 2) Crie um vetor de inteiros, atribua valores ao vetor e imprima a soma dos seus elementos.

package atividade5;

import java.util.Scanner;

public class exe2 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um tamanho para o vetor");
		int valoresLength = scanner.nextInt();
		
		int[] valores = new int[valoresLength];
		
		int soma = 0;
		
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite um valor para a posição: " + i);
			valores[i] = scanner.nextInt();
			soma += valores[i];
		}
		
		System.out.printf("A soma de todos os valores informados é: %d", soma);
		
		scanner.close();
	}

}
