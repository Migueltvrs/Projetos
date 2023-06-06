/* 3) Escreva um algoritmo que solicite uma sequência de números ao usuário e realize a soma desses números. 
	  Encerre a execução quando zero for digitado. */

package atividade4;
import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
					
				Scanner scanner = new Scanner(System.in);
				
				int contador = 0;
				
				System.out.println("Digite o número desejado ou digite '0' para encerrar o programa.");
				
				for(int i = 0; ; i++) {
					int numero = scanner.nextInt();
					
					if(numero == 0) {
						break;
						
					} else {
						contador += numero;
						System.out.println("Digite o número desejado ou digite '0' para encerrar o programa.");
							
					}
				}	
				System.out.printf("O valor da sequencia digitada, foi: %d", contador);
				
			}
		}