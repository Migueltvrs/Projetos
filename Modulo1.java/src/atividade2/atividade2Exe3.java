// 3) Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é positivo ou negativo.
package atividade2;

import java.util.Scanner;

public class atividade2Exe3 {

	public static void main(String[] args) {
		
		Scanner positivoNegativo = new Scanner(System.in);
		int numero;
		
		System.out.println("digite um número: ");
		numero = positivoNegativo.nextInt();
		
		if(numero >= 0) {
			
			System.out.println("O número: " + numero + " é POSITIVO.");
		
		} else {
			
			System.out.println("O número: " + numero + " é NEGATIVO.");
			
		}
	}
}
