package ReinoAnimal;

public class AnimalMain {

	public static void main(String[] args) {
		
		cachorro dog = new cachorro("Aristides", "Caramelo", 5, false);
		
		
		System.out.println(dog.getNome());
		System.out.println(dog.getRaca());
		System.out.println(dog.getIdade());
		dog.somAnimal();
		
		System.out.println("-----------------------------");
		

		Gato gato = new Gato("Fumaça", "Vira-Lata", 10, true);
		
		System.out.println(gato.getNome());
		System.out.println(gato.getRaca());
		System.out.println(gato.getIdade());
		gato.somAnimal();
		
		
		

	}

}
