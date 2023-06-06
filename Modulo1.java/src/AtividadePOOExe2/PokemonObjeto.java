/* 2) Criar uma classe de uma entidade escolhida por você, pode ser um carro, cachorro, um funcionário, etc.... 
 *    crie atributos e métodos para essa classe. 
 *    Crie a uma classe com o método main para criar os objetos da classe que você escolheu 
 *    e mostrar os dados dos atributos e métodos no console.
 */

package AtividadePOOExe2;

public class PokemonObjeto {


	boolean guardadoPokebola;
	
	
	//informaações do pokemon
	void pokemon(String nome, String tipo, int poder){
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Poder: " + poder + "\n");

	}
	
	//retornar o pokemon para a pokebola
	void voltarPokebola(String nome) {
		if(guardadoPokebola) {
			System.out.println(nome + " já está na pokebola!" + "\n");
			
		} else {
			System.out.println(nome + " voltou para a pokebola" + "\n");
		
		}
		
		guardadoPokebola = true;
	}
	
	//retirar o pokemon da pokebola
	void sairPokebola(String nome) {
		if(guardadoPokebola == false) {
			System.out.println(nome + " já está fora da pokebola!" + "\n");
			
		} else {
			System.out.println(nome + " saiu da pokebola" + "\n");
		
		}
		
		guardadoPokebola = false;
	}
	
	
	
}
