//Crie uma classe "Carro" com os atributos "modelo" e "ano" e os métodos "ligar" e "desligar". 
//Em seguida, crie um objeto dessa classe e teste os métodos.


package Praticando;

public class CarroClasse {

	public static void main(String[] args) {
		
		CarroObjeto carro = new CarroObjeto();
		
		carro.modelo = "HB20";
		carro.ano = 2023;
		
		carro.ligar();
		carro.pulaLinha();
		carro.desligar();
		

	}

}
