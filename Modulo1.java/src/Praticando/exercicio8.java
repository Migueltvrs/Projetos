//Faça um programa que solicite ao usuário uma frase e conte quantas vogais existem na frase.

package Praticando;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		String[] frase = new String[100];
		int contador = 0;
		
		System.out.println("Digite uma frase: ");
		
		for(int i = 0; i < frase.length; i++) {
			if(frase[i] == "a" || frase[i] == "e" || frase[i] == "i" || frase[i] == "o" || frase[i] == "u") {
				contador++;
		}
		
		
		}
		System.out.println(contador);
		
	}

}

// falta implementar scanner no for.