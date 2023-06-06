/* 7) Faça um algoritmo para calcular a área de um triângulo. Obs.: Área = ( Base * Altura ) / 2. 
 *    Será necessário criar variáveis para armazenar o valor da base e da altura. 
 *    Em seguida, colocar na fórmula e apresentar a sua área.*/
package atividade2;

import java.util.Scanner;

public class atividade2exe7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("informe a base do triângulo: ");
		double base = scanner.nextDouble();
		
		System.out.println("Informe a altura do triângulo: ");
		double altura = scanner.nextDouble();
		
		
		double area = (base * altura) / 2;
		
		System.out.println("A área do triângulo é: " + area);
		
	}
}
