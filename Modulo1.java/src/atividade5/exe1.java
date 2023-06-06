//1) Crie um vetor de inteiros de 10 posições e atribua valores utilizando estrutura de repetição, em seguida imprimir os seus elementos.

package atividade5;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] valores = new int[10];
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite um valor para a posição: " + i);
			valores[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < valores.length; i++ ) {
			System.out.print(valores[i] + " ");
		}
		
		scanner.close();
	}

}
