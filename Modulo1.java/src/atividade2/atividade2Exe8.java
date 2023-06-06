/*8) Fazer um programa que recebe os valores dos três lados de um triangulo.  
 * Com esses três valores, deve informar se o triângulo  é:
 - equilátero (três lados iguais);
 - isósceles (dois lados iguais) ou 
 - escaleno (três lados diferentes).*/
package atividade2;

import java.util.Scanner;

public class atividade2Exe8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Informe o valor do lado 1 do triângulo: ");
		double lado1 = scanner.nextDouble();
		
		System.out.println("Informe o valor do lado 2 do triângulo: ");
		double lado2 = scanner.nextDouble();
		
		System.out.println("Infome o valor do lado 3 do triângulo: ");
		double lado3 = scanner.nextDouble();
		
		
		if (lado1 == lado2 && lado2 == lado3) {
			
			System.out.println("O triângulo é EQUILÁTERO.");
			
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			
			System.out.println("O triângulo é: ISÓSCELES.");
			
		} else {
			
			System.out.println("O triângulo é ESCALENO.");
			
		}
	}
}
