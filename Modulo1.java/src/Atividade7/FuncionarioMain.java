/*1) Criar a classe Funcionário. Um funcionário deve ter pelo menos os atributos nome, matrícula e salário. 
     Passe os valores dos atributos utilizando construtor. Criar um método  para aumentar o salário em 15%. 
     Imprimir os valores dos atributos e fazer a chamada do método.*/


package Atividade7;

public class FuncionarioMain {

	public static void main(String[] args) {

		FuncionarioObjeto funcionario = new FuncionarioObjeto("Sr. Fulano", 2023, 10000);		
		
		funcionario.dadosFuncionario();
		funcionario.pulaLinha();
		System.out.println("Salário com acréscimo de 15%: R$ " + funcionario.salario15());
		
		
	}

}
