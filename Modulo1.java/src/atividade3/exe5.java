/* 5) Crie um algoritmo para mostrar a tabuada de multiplicação de um número informado pelo usuário.*/

package atividade3;
import java.util.Scanner;

public class exe5{
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número desejado: ");
		int numero = scanner.nextInt();
		
		int contador = 1;
		
		while (contador < 10) {
			
			System.out.println(numero * contador);
			contador++;
			
		}
	}
}
