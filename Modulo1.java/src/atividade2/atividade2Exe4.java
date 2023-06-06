// 4) Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.
package atividade2;

import java.util.Scanner;

public class atividade2Exe4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro valor: ");
		double valor1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double valor2 = scanner.nextDouble();
		
		
		if (valor1 == valor2) {
			
			System.out.println("Os valores informados são iguais.");						
			
		} else if (valor1 > valor2) {
			
			System.out.println(valor1);	
		 
		} else {
			
			System.out.println(valor2);
		}
	}
}
