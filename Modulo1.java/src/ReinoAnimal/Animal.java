package ReinoAnimal;

public abstract class Animal {
	
	private String nome;
	private String raca;
	private int idade;
	private boolean vacina;
	
	
	public abstract void somAnimal();
	
	
//nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
//raça		
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
		
		
//idade		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
		
		
//vacina		
	}
	public boolean isVacina() {
		return vacina;
	}
	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}
	
}
