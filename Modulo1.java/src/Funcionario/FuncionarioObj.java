//Crie uma classe "Funcionario" com os atributos "nome" e "salario". 
//Em seguida, crie um vetor de objetos dessa classe e preencha-o com alguns funcionários e seus respectivos salários. 
//Calcule a média salarial e exiba o nome dos funcionários que possuem salário acima da média.

package Funcionario;

public class FuncionarioObj {
	
	private String nome;
	private double salario;
	
	
	public FuncionarioObj(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
