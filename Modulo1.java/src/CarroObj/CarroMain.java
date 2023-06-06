//Crie uma classe chamada "Carro" que tenha os seguintes atributos: marca, modelo e ano. 
//A classe deve ter um construtor que receba esses três valores como parâmetros e os atribua aos respectivos atributos. 
//Crie também um método chamado "exibirInformacoes" que imprima as informações do carro.

package CarroObj;

public class CarroMain {

	public static void main(String[] args) {
		
		CarroObj carro = new CarroObj("Fiat", "Palio", 2023);
		carro.exibirInformacoes();
		
		System.out.println("---------------------------");
		
		CarroObj carro2 = new CarroObj("Toyota", "Corola", 2023);
		carro2.exibirInformacoes();
	}

}
