package Aulas;

import java.util.Scanner;


public class aula3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = scanner.nextInt();
		
		System.out.println("Digite o segubndo valor: ");
		int valor2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		double valor3 = scanner.nextDouble();
		
		System.out.printf("%s A %d soma  %d é %f: ", nome, valor1, valor2, valor3);  
		
		// printf - valor formatado
		// %d (% d= inteiro, s= string, f= ponto flutuante) marcador de numero inteiro, marca onde valor vai ficar
		//syso + ctrl + espaço = System.out.println();

	}
}
