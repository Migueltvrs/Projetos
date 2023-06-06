//3) Crie um algoritmo que lê um valor em dólar e converta o valor para Reais. Considere que a cotação do dólar é US$ 1.00 = R$ 4,99.
package atividade1;


public class atividade1Exe3 {

	public static void main(String[] args) {
		
		double dolar = 4.99;
		double valorEmdolar = 100;
		double dolarParaReal = valorEmdolar * dolar;
		
		System.out.println("Eu tenho US$ " + valorEmdolar + ". Convertendo esse valor para REAIS, eu possuo: R$ " + dolarParaReal);

	}

}
