package PokemonBatalha;

public class PokemonObjeto {
	
	String pokemon1;
	String tipo1;
	int poder1;
	
	String pokemon2;
	String tipo2;
	int poder2;
	
	
	
	void pokemon1(String nome, String tipo, int poder) {
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Poder: " + poder + "\n");
		
	}
	
	
	void pokemon2(String nome, String tipo, int poder) {
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Poder: " + poder + "\n");
	}
	
	
	void batalha() {
	    // Verificar qual Pokémon tem maior poder
	    if (poder1 > poder2) {
	        System.out.println("\n O Pokémon 1 venceu a batalha!");
	        
	    } else if (poder2 > poder1) {
	        System.out.println("\n O Pokémon 2 venceu a batalha!");
	        
	    } else {
	        System.out.println("\n A batalha terminou em empate!");
	        
	    }
	}
	
	void batalha2() {
		
		batalha();
		
		
	}

}
