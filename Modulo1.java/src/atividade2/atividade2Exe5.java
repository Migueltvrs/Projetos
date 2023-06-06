/* 5) Crie um programa que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela. No final, analise a média e 
	  mostre se o aluno foi aprovado o reprovado (considere 7.0 a nota de aprovação).*/
package atividade2;

import java.util.Scanner;

public class atividade2Exe5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o nome o nome do aluno: ");
		String nome = scanner.nextLine();                       //nextLine para String
			
		System.out.println("Valor da primeira nota: ");
		double nota1 = scanner.nextDouble();                    //NEXT.INT OU DOUBLE? - double
		
		System.out.println("Valor da segunda nota: ");
		double nota2 = scanner.nextDouble();                    
		
		double media = (nota1 + nota2) / 2;
		
		
		if(media >= 7) {
			
			System.out.println(nome + " foi aprovado com a média: " + media);
			
		}else{
			
			System.out.println(nome + " foi reprovado com a média: " + media);
			
		}
	}
}
