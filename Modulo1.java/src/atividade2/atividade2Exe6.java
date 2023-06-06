/*6) Em uma loja está tendo uma promoção que oferece descontos na hora do pagamento:
   - Homens ganham 8% de desconto;
   - Mulheres 15% de desconto.
     Faça um programa que receba o nome, o sexo e o valor da compra do cliente e calcule o preço com desconto.*/
package atividade2;

import java.util.Scanner;

public class atividade2Exe6 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		//nome
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		//sexo
		System.out.println("Indique o seu sexo: ");
		String sexo = scanner.nextLine();
		
		//valor da compra
		System.out.println("Digite o valor da compra: ");
		double valor = scanner.nextDouble();
		
		
		double valorComDesconto = valor;
		
			
		if(sexo.equalsIgnoreCase("homem") || sexo.equalsIgnoreCase("masculino")) {   //ignora variações de maiúsculas e minúsuclas
			
			valorComDesconto = valorComDesconto - (valor * 0.08);
			System.out.println(nome + "\n" + sexo + "\n" + valor + "\n" + valorComDesconto);
			
		} else if(sexo.equalsIgnoreCase("mulher") || sexo.equalsIgnoreCase("feminino")) {
			
			valorComDesconto = valorComDesconto - (valor * 0.15);
			System.out.println(nome + "\n" + sexo + "\n" + valor + "\n" + valorComDesconto);
			
		} else {
			
			System.out.println(nome + "\n" + sexo + "\n" + valor + "\n" + valorComDesconto);
			
		}
	}
}
