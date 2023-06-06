package Aulas;

import java.util.Scanner;

public class exercitando {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite a sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Digite o seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		double imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			
			System.out.printf("O IMC de %s é: %f. %s tem %d anos e está abaixo do seu peso ideal.", nome, imc, nome, idade);
			
		} else if (imc > 18.5 && imc <= 24.9) {
			
			System.out.printf("O IMC de %s é: %f. %s tem %d anos e está no seu peso ideal.", nome, imc, nome, idade);
			
		} else if (imc > 24.9 && imc <= 29.9) {
			
			System.out.printf("O IMC de %s é: %f. %s tem %d anos e está com sobrepeso.", nome, imc, nome, idade);
			
		} else if (imc > 29.9 && imc <= 34.9) {
			
			System.out.printf("O IMC de %s é: %f. %s tem %d anos e está com obesidade de grau 1.", nome, imc, nome, idade);
			
		} else if (imc > 34.9 && imc <= 39.9) {
			
			System.out.printf("O IMC de %s é: %f. %s tem %d anos e está com obesidade de grau 2.", nome, imc, nome, idade);
			
		} else {
			
			System.out.printf("O IMC de %s é: %f. %s tem %d anos e está com obesidade de grau 3.", nome, imc, nome, idade);
			
		}
		
		// System.out.printf("O IMC de %s é: %f", nome, imc);
		
		
		
		
	}

}
