// 2) Faça um programa que Imprima a soma de todos os números de 1 até 100.

package atividade4;
import java.util.Scanner;

	public class exe2 {
	
		public static void main(String[] args) {
			
			int[] numeros = new int[100];
			
				
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = i + 1;
				//System.out.println(numeros[i]);
			}
			
			//soma do array:
			
			int soma = 0;
			
			for(int i = 0; i < numeros.length; i++) {			
				soma = numeros[i] + soma;
				System.out.println(soma);
			}
	
			System.out.println("A soma total de todos os números de 1 até 100, é: " + soma);	
		}	
	}