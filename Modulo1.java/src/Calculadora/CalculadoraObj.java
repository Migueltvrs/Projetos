//Crie uma classe "Calculadora" com os métodos estáticos "somar", "subtrair", "multiplicar" e "dividir", que recebam dois números como...
//...parâmetros e retornem o resultado das operações correspondentes. 
//Implemente um método chamado "calcular" que receba uma expressão matemática no formato "número operador número" (por exemplo, "5 + 3")...
//...e retorne o resultado da operação.


package Calculadora;

public class CalculadoraObj {
	
	static public int somar(int num1, int num2) {
		return num1 + num2;
	}

	
	static public int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	
	static public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	
	static public int dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	
	
	static public String calcular(int num1, String operacao, int num2) {
		return num1 + (operacao) + num2;
	}
	
	
}
