// Faça um programa que solicite ao usuário um número e verifique se ele é primo ou não.

package Praticando;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
        boolean ehPrimo = true;
        

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                System.out.print(i + " ");
                break;
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é primo");
            
        } else {
            System.out.println(numero + " não é primo");
        }

	}

}
