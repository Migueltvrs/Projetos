package ReinoAnimal;

public class Gato extends Animal {
	
	Gato(String nome, String raca, int idade, boolean vacina){
		setNome(nome);
		setRaca(raca);
		setIdade(idade);
		setVacina(vacina);
		
		if(vacina) {
			System.out.println(nome + " está vacinado.");
		} else {
			System.out.println(nome + " não está vacinado.");
		}
		
	}
	

	@Override
	public void somAnimal() {
		System.out.println("Miau");
		
	}
	
	

}
