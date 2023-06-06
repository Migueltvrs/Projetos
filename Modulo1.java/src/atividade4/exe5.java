// 5) Crie um algoritmo para mostrar a tabuada de multiplicação de um número informado pelo usuário.

package atividade4;
import java.util.Scanner;
import java.util.Arrays;

public class exe5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		int[] tabuada = new int[9];
		
		for(int i = 1; i <= 9; i++) {
			tabuada[i - 1] = numero * i;
		}
		
		System.out.println(Arrays.toString(tabuada));
		
	}

}
