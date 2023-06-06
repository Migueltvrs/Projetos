//Crie uma classe chamada "Circulo" que tenha o atributo raio. 
//A classe deve ter um construtor que receba o valor do raio como parâmetro. 
//Crie métodos para calcular a área e o perímetro do círculo. 
//Crie também um método chamado "exibirInformacoes" que imprima as informações do círculo.

package Circulo;

public class CirculoObj {
	
	private double raio;
	
	
	public CirculoObj(double raio) {
		this.raio = raio;
		
	}
	
	
	public double areaCirculo() {
		return 3.14 * (raio * raio);
		
	}
	
	
	public double perimetroCirculo() {
		return 2 * 3.14 * this.raio;
		
	}
	
	
	public void exibirInformacoes() {
		System.out.println("Área do círculo: " + areaCirculo());
		System.out.println("Perímetro do círculo: " + perimetroCirculo());
		
	}
	
	

	
}
