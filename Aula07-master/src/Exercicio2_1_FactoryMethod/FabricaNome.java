package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Giovanna Selihevic Marques - 81613657
 *
 */
public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
