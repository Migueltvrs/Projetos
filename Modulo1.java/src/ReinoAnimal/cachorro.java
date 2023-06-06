package ReinoAnimal;

public class cachorro extends Animal {
	
	cachorro(String nome, String raca, int idade, boolean vacina){
		setNome(nome);
		setRaca(raca);
		setIdade(idade);
		setVacina(vacina);
		
		if(vacina) {
			System.out.println(nome + " foi vacinado.");
		} else {
			System.out.println(nome + " não foi vacinado.");
		}
		
		
		
	}
	
	@Override
	public void somAnimal() {
		System.out.println("Au");
		
	}
	
	

}
