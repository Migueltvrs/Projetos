/* Crie uma classe "Retangulo" com os atributos "largura" e "altura" e os métodos "calcularArea" e "calcularPerimetro". 
 * Em seguida, crie um objeto dessa classe, atribua valores aos atributos e exiba a área e o perímetro do retângulo. */


package Praticando;
import java.util.Scanner;


public class RetanguloClasse {

	public static void main(String[] args) {
		
		RetanguloObjeto retangulo = new RetanguloObjeto();
		Scanner retangulo1 = new Scanner(System.in);
		
		System.out.println("Informe o a altura do retângulo: ");
		retangulo.altura = retangulo1.nextDouble();
		
		System.out.println("Informe a largura do retângulo: ");
		retangulo.largura = retangulo1.nextDouble();
		
		retangulo.calcularArea();
		retangulo.calcularPerimetro();

	}

}
