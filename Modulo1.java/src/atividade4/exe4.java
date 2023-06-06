// 4)Escreva um algoritmo que leia 10 números digitados pelo usuário e exiba quantos números são pares.

package atividade4;
import java.util.Scanner;
import java.util.Arrays;

public class exe4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		System.out.println("Digite o primeiro número: ");
		numeros[0] = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numeros[1] = scanner.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numeros[2] = scanner.nextInt();
		
		System.out.println("Digite o quarto número: ");
		numeros[3] = scanner.nextInt();
		
		System.out.println("Digite o quinto número: ");
		numeros[4] = scanner.nextInt();
		
		System.out.println("Digite o sexto número: ");
		numeros[5] = scanner.nextInt();
		
		System.out.println("Digite o sétimo número: ");
		numeros[6] = scanner.nextInt();
		
		System.out.println("Digite o oitavo número: ");
		numeros[7] = scanner.nextInt();
		
		System.out.println("Digite o nono número: ");
		numeros[8] = scanner.nextInt();
		
		System.out.println("Digite o décimo número: ");
		numeros[9] = scanner.nextInt();
		
		System.out.println("Os números inseridos foram esses: " + Arrays.toString(numeros));
		
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
			}
			
		}
		
	}

}









//int numero1 = scanner.nextInt();
//
//System.out.println("Digite o segundo número: ");
//int numero2 = scanner.nextInt();
//
//System.out.println("Digite o terceiro número: ");
//int numero3 = scanner.nextInt();
//
//System.out.println("Digite o quarto número: ");