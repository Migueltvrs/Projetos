//7) Crie um programa que mostre na tela a seguinte contagem: 100 95 90 85 80 ... 0  Fim do programa!

package atividade4;
import java.util.Arrays;

public class exe7 {

	public static void main(String[] args) {

		int[] contagem = new int[21];
		int contador = 0;
		
		for(int i = 100; i >= 0; i -= 5) {
			contagem[contador] = i;
			contador++;
			
			}
		System.out.println(Arrays.toString(contagem) + " Fim do programa!");
		
		}
		
	}



//scanner.nextInt();
//input.nextInt();