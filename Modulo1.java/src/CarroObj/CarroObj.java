//Crie uma classe chamada "Carro" que tenha os seguintes atributos: marca, modelo e ano. 
//A classe deve ter um construtor que receba esses três valores como parâmetros e os atribua aos respectivos atributos. 
//Crie também um método chamado "exibirInformacoes" que imprima as informações do carro.

package CarroObj;

public class CarroObj {
	
	String marca;
	String modelo;
	int ano;
	
	public CarroObj(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	
	}

	
	public void exibirInformacoes() {
		System.out.println("A marca do carro é: " + this.marca);
		System.out.println("O modelo do carro é: " + this.modelo);
		System.out.println("O ano do carro é: " + this.ano);
		
	}
	

}
