/* 6) Crie um programa que solicite a idade de 10 pessoas e imprima na tela:
      - Qual é a média de idade das 10 pessoas;
	  - Quantas pessoas são maiores de idade;
	  - Quantas pessoas são menores de idade;
	  - Qual a idade da pessoa mais velha.*/

package atividade4;
import java.util.Scanner;
import java.util.Arrays;

public class exe6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] idades = new int[10];

		System.out.println("Digite a primeira idade: ");
		idades[0] = scanner.nextInt();

		System.out.println("Digite a segunda idade: ");
		idades[1] = scanner.nextInt();

		System.out.println("Digite a terceira idade: ");
		idades[2] = scanner.nextInt();

		System.out.println("Digite a quarta idade: ");
		idades[3] = scanner.nextInt();

		System.out.println("Digite a quinta idade: ");
		idades[4] = scanner.nextInt();

		System.out.println("Digite a sexta idade: ");
		idades[5] = scanner.nextInt();

		System.out.println("Digite a sétima idade: ");
		idades[6] = scanner.nextInt();

		System.out.println("Digite a oitava idade: ");
		idades[7] = scanner.nextInt();

		System.out.println("Digite a nona idade: ");
		idades[8] = scanner.nextInt();

		System.out.println("Digite a décima idade: ");
		idades[9] = scanner.nextInt();

		double contadorMedia = 0;

		// média das idades
		for (int i = 0; i < idades.length; i++) {
			contadorMedia += idades[i];

		}
		System.out.println("a média das idades informadas é: " + (contadorMedia / idades.length));

		
		// quantas pessoas são de maior e menor
		
		
		int contadorMaior = 0;
		int contadorMenor = 0;

		for (int i = 0; i < idades.length; i++) {
			if (idades[i] >= 18) {
				contadorMaior++;

			} else {
				contadorMenor++;
				
			}
		}
		System.out.println("Pessoas maiores de idade: " + contadorMaior);
		System.out.println("Pessoas menores de idade: " + contadorMenor);
		
		//maior idade
		
		int maiorIdade = idades[0];
		
		for(int i = 1; i < idades.length; i++) {
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
			}
		}
		System.out.println("A maior idade é: " + maiorIdade);
	}
}




// seleciona todos os mesmos nomes: variável + shift + alt + R