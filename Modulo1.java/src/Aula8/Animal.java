package Aula8;

public abstract class Animal {
	
	private String nome;
	String raca;
	int idade;
	boolean vacina;
	
	
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	abstract void vozAnimal();
	
	
	

}
