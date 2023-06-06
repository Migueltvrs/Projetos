// 1) Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é par ou ímpar.
package atividade2;

public class atividade2Exe1 {

	public static void main(String[] args) {
		
		int numero = 111550;
		
		if (numero % 2 == 0) {
			
			System.out.println("O número: " + numero + " é PAR");
		
		} else {
			
			System.out.println("O número: " + numero + " é ÍMPAR");
			
		}
	}
}
