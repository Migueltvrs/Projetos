/* 2) Criar uma classe de uma entidade escolhida por você, pode ser um carro, cachorro, um funcionário, etc.... 
 *    crie atributos e métodos para essa classe. 
 *    Crie a uma classe com o método main para criar os objetos da classe que você escolheu 
 *    e mostrar os dados dos atributos e métodos no console.*/

package AtividadePOOExe2;

public class PokemonClasse {

	public static void main(String[] args) {

		PokemonObjeto pokemonOb = new PokemonObjeto();
		
		pokemonOb.guardadoPokebola = true;
		
		//charizard: sai da pokebola / informações do pokemon / volta para pokebola
		pokemonOb.sairPokebola("Charizard");
		pokemonOb.pokemon("Charizard", "Fogo", 100);
		pokemonOb.voltarPokebola("Charizard");
		
		//pikachu: sai da pokebola / informações do pokemon / volta para pokebola
		pokemonOb.sairPokebola("Pikachu");
		pokemonOb.pokemon("Pikachu", "Elétrico", 80);
		pokemonOb.voltarPokebola("Pikachu");
		
		//blastoise: sai da pokebola / informações do pokemon / volta para pokebola / volta para pokebola + nova informação
		pokemonOb.sairPokebola("Blastoise");
		pokemonOb.pokemon("Blastoise", "Água", 90);
		pokemonOb.voltarPokebola("Blastoise");
		pokemonOb.voltarPokebola("Blastoise");	
		
	}

}
