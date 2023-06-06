/* 2)  Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa (M para masculino e  F  para  feminino).  
 *     Se  for  masculino,  mostra  a  mensagem  “Seja  bem-vindo,  Senhor!”,  se  for feminino, mostre a mensagem “Seja bem-vinda, Senhora!”. 
 */

package atividade3;
import java.util.Scanner;


public class exe2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o sexo 'M' ou 'F': ");
		String sexo = scanner.nextLine();
		
		if (sexo.equalsIgnoreCase("m")) {
			
			System.out.println("Seja bem-vindo, Senhor!");
			
		} else {
			
			System.out.println("Seja bem-vinda, Senhora!");
			
		}
		
		

	}

}
