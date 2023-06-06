package PokemonBatalha;
import java.util.Random;

public class PokemonClasse {

	public static void main(String[] args) {
		
		Random random = new Random();
		PokemonObjeto objeto = new PokemonObjeto();
		
		//Definindo aleatoriedade dos tipos
		String[] tipos = {"Fogo", "Água", "Terra", "Elétrico"};
		int tiposSorteio1 = random.nextInt(tipos.length);
		int tiposSorteio2 = random.nextInt(tipos.length);
		
		
		//pokemon1
		objeto.tipo1 = tipos[tiposSorteio1];
		objeto.poder1 = random.nextInt(101);
		
		//pokemon2
		objeto.tipo2 = tipos[tiposSorteio2];
		objeto.poder2 = random.nextInt(101);
		

		
		
		//imprimindo antes dos bônus
		System.out.println(objeto.tipo1);
		System.out.println(objeto.poder1);
		System.out.println(objeto.tipo2);
		System.out.println(objeto.poder2);
		
		System.out.println("");
		System.out.println("");
		
		
		
//bonus de vantagens e desvantagens dos tipos
//água		
		if(objeto.tipo1 == "Água" && objeto.tipo2 == "Água") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 = objeto.poder2;
			
		}else if(objeto.tipo1 == "Água" && objeto.tipo2 == "Fogo" ) {
			objeto.poder1 += (objeto.poder1 * 0.5);
			objeto.poder2 = objeto.poder2;
			
		}else if(objeto.tipo1 == "Água" && objeto.tipo2 == "Terra") {
			objeto.poder1 += (objeto.poder1 * 0.5);
			objeto.poder2 = objeto.poder2;
			
		}else if(objeto.tipo1 == "Água" && objeto.tipo2 == "Elétrico") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 += (objeto.poder2 * 0.5);
//fogo
		} else if(objeto.tipo1 == "Fogo" && objeto.tipo2 == "Fogo") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 = objeto.poder2;
			
		}else if(objeto.tipo1 == "Fogo" && objeto.tipo2 == "Água") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 += (objeto.poder2 * 0.5);
			
		}else if(objeto.tipo1 == "Fogo" && objeto.tipo2 == "Terra") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 += (objeto.poder2 * 0.5);
			
		}else if(objeto.tipo1 == "Fogo" && objeto.tipo2 == "Elétrico") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 = objeto.poder2;
//terra			
		}else if(objeto.tipo1 == "Terra" && objeto.tipo2 == "Terra") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 = objeto.poder2;
			
		}else if(objeto.tipo1 == "Terra" && objeto.tipo2 == "Fogo") {
			objeto.poder1 += (objeto.poder1 * 0.5);
			objeto.poder2 = objeto.poder2;
			
		}else if(objeto.tipo1 == "Terra" && objeto.tipo2 == "Água") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 += (objeto.poder2 * 0.5);
			
		}else if(objeto.tipo1 == "Terra" && objeto.tipo2 == "Elétrico") {
			objeto.poder1 += (objeto.poder1 * 0.5);
			objeto.poder2 = objeto.poder2;
//elétrico			
		}else if(objeto.tipo1 == "Elétrico" && objeto.tipo2 == "Elétrico") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 = objeto.poder2;
			
		}else if(objeto.tipo1 == "Elétrico" && objeto.tipo2 == "Fogo") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 = objeto.poder2;
			
		}else if(objeto.tipo1 == "Elétrico" && objeto.tipo2 == "Água") {
			objeto.poder1 += (objeto.poder1 * 0.5);
			objeto.poder2 = objeto.poder2;
			
		}else if(objeto.tipo1 == "Elétrico" && objeto.tipo2 == "Terra") {
			objeto.poder1 = objeto.poder1;
			objeto.poder2 += (objeto.poder2 * 0.5);
			
		}
		
		
		
		
		
		
		
		
		//Imprimindo duelo
		System.out.println(objeto.tipo1);
		System.out.println(objeto.poder1);
		System.out.println(objeto.tipo2);
		System.out.println(objeto.poder2);
		
		objeto.batalha();
		
		
		
		
		//fogo > planta e < terra, agua
		//agua > fogo, terra e < eletrico, planta
		//terra > eletrico, fogo e < agua
		//eletrico > agua e < terra
		
		
		
		
	
		
		
		
		

	}

}
