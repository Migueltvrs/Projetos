//5) Escreva um programa que Imprima na tela o seu  nome, a soma, a subtração, a multiplicação e a divisão de dois valores inteiros.
package atividade1;


public class atividade1Exe5 {

	public static void main(String[] args) {
		
		String meuNome = "Miguel Tavares";
		int idade1 = 40;
		int idade2 = 31;
				
		System.out.println("O meu nome é: " + meuNome + ", Respectivamente, minha esposa e eu, temos: " + idade2 + " e " + idade1 + " anos" + 
							". A soma de nossas idades é: " + (idade1 + idade2) + " anos, a subtração de nossas idades é: " + (idade1 - idade2)
							+ " anos, se dividir as nossas idades, vamos obter o valor de aproximadamente: " + (idade1 / idade2) + " e se multiplicarmos a nossa idade, vamos obter o valor: "
							+ (idade1 * idade2));

	}

}
