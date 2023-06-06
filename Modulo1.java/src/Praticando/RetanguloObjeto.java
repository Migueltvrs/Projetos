/* Crie uma classe "Retangulo" com os atributos "largura" e "altura" e os métodos "calcularArea" e "calcularPerimetro". 
 * Em seguida, crie um objeto dessa classe, atribua valores aos atributos e exiba a área e o perímetro do retângulo. */


package Praticando;

public class RetanguloObjeto {
	
	double largura;
	double altura;
	
	
	void calcularArea() {
		System.out.println("A área do retângulo é: " + (largura * altura)); 
		
	}
	
	void calcularPerimetro(){
		System.out.println("O perímetro do retângulo é: " + ((largura * 2) + (altura * 2)));
		
	}
	
	

}
