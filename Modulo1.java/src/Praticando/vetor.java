//vetor de 10 elementos e imprimir

package Praticando;
import java.util.Scanner;
import java.util.Arrays;


public class vetor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		

		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número para ficar na posição: " + i);
			numeros[i] = scanner.nextInt();
			
		}
		//par
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				
			} else {
				
			}
		
			}
		//ímpar
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + " ");
		}
			
			
		}	
		scanner.close();
	}
}
