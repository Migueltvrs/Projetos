//6)  Faça um programa que leia dois valores inteiros para as variáveis A e B, em seguida efetuar a troca dos valores das variáveis de modo que a variável A receba o valor da variável B, e a variável B receba o valor da variável A. Apresentar os valores trocados.
package atividade1;


public class atividade1Exe6 {

	public static void main(String[] args) {
		
		int A = 100;
		int B = 20;
		
		System.out.println("O valor da variável A é: " + A + " e o valor da variável B é: " + B);
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("Fazendo a troca de valores das variáveis, obteremos os seguintes valores, A: " + A + " e B: " + B);

	}

}
