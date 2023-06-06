/*1) Criar a classe Funcionário. 
 * 	 Um funcionário deve ter pelo menos os atributos nome, matrícula e salário. 
     Passe os valores dos atributos utilizando construtor. 
     Criar um método para aumentar o salário em 15%. 
     Imprimir os valores dos atributos e fazer a chamada do método.*/	


package Atividade7;

public class FuncionarioObjeto {
	
	String nome;
	int matricula;
	double salario;
	
	
	public FuncionarioObjeto(String nome, int matricula, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		
	}
	
	
//dados do funcionário	
	public void dadosFuncionario(){
		System.out.println("O nome do funcionário é: " + this.nome);
		System.out.println("O número de sua matrícula é: " + this.matricula);
		System.out.println("O seu salário é: R$ " + this.salario);
	}
	
	
// aumento do salário em 15%	
	public double salario15() {
		double aumento = this.salario * 0.15;
		this.salario += aumento;
		return this.salario;
	}
	
	
//pula linha
	public void pulaLinha() {
		System.out.println();
	}
	
}
