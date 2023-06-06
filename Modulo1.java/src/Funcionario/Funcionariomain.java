//Crie uma classe "Funcionario" com os atributos "nome" e "salario". 
//Em seguida, crie um vetor de objetos dessa classe e preencha-o com alguns funcionários e seus respectivos salários. 
//Calcule a média salarial e exiba o nome dos funcionários que possuem salário acima da média.

package Funcionario;

public class Funcionariomain {

	public static void main(String[] args) {
		
		FuncionarioObj[] funcionarios = new FuncionarioObj[5];
		
		funcionarios[0] = new FuncionarioObj("Diogo", 2000);
		funcionarios[1] = new FuncionarioObj("Miguel", 10000);
		funcionarios[2] = new FuncionarioObj("Fulano", 3000);
		funcionarios[3] = new FuncionarioObj("Fulana", 7000);
		funcionarios[4] = new FuncionarioObj("Fulaninha", 5000);
		
		
		double salarioTotal = 0;
		
		for(int i = 0; i < funcionarios.length; i++ ) {
			double contador = funcionarios[i].getSalario();
			salarioTotal += contador;
		}
		
		
		
		double mediaSalarios = salarioTotal / funcionarios.length;
		System.out.println("A média salarial é de: R$ " + mediaSalarios);
		
		System.out.println("------------------------------");
		
		
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i].getSalario() >= mediaSalarios) {
				System.out.println(funcionarios[i].getNome() + " possui o salário acima da média.");
			} else {
				System.out.println(funcionarios[i].getNome() + " possui o salário abaixo da média.");
			}
		}
		
		
		
	}

}
