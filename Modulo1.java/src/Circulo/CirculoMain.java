package Circulo;

public class CirculoMain {

	public static void main(String[] args) {
		
		CirculoObj circulo = new CirculoObj(10);
		
		System.out.println(circulo.areaCirculo());
		System.out.println("--------------------");
		System.out.println(circulo.perimetroCirculo());
		System.out.println("--------------------");
		circulo.exibirInformacoes();
		
		

	}

}
