/* 3)  Crie um algoritmo que leia dois valores x e y, representando um intervalo. (sendo x o início do intervalo e y o fim do intervalo). 
 *     Em seguida, leia um novo valor z e verifique se z pertence ao intervalo [x, y]. */
 
package atividade3;
import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		double x = scanner.nextDouble();
		
		System.out.println("Digite o valor de y: ");
		double y = scanner.nextDouble();
		
		System.out.println("Digite o valoz de z: ");
		double z = scanner.nextDouble();
		
		if(z >= x && z <= y) {
			
			System.out.printf("z: %f, pertence ao intervalo de x e y.", z);
			
		} else {
			
			System.out.printf("z: %f, não pertence ao intervalo de x e y.", z);
			
		}
	}

}
