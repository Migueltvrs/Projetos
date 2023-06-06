//Crie uma classe "Carro" com os atributos "modelo" e "ano" e os métodos "ligar" e "desligar". 
//Em seguida, crie um objeto dessa classe e teste os métodos.

package Praticando;

public class CarroObjeto {

	String modelo;
	int ano;
	
	
	void ligar() {
		System.out.println("Modelo do carro: " + modelo);
		System.out.println("Ano do carro: " + ano);
		System.out.println("Você ligou o carro.");
		
	}
	
	
	void desligar() {
		System.out.println("Modelo do carro: " + modelo);
		System.out.println("Ano do carro: " + ano);
		System.out.println("Você desligou o carro.");
		
	}
	
	
	void pulaLinha() {
		System.out.println(" ");
	}
	
}
