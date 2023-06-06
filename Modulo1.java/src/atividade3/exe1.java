/* 1) Faça um algoritmo que leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
      A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5,. 
      OBS: A variável F representa a temperatura em graus Fahrenheit e a variável C representa a temperatura em graus Celsius.*/

package atividade3;
import java.util.Scanner;


public class exe1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor em CELSIUS: ");
		double C = scanner.nextDouble();
		
		double F = (9 * C + 160) / 5;
		
		System.out.printf("A temperatura em graus CELSIUS é: %f, convertida para FAHRENHEIT é: %f", C, F);

	}

}
