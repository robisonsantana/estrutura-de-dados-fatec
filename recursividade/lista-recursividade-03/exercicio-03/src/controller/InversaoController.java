package controller;

public class InversaoController {
	
	public InversaoController() {
		super();
	}
	
	public String inversao(String originalString) {
		
		//Condição de Parada -> Quando a variável não ter mais posições.
		if(originalString.isEmpty()) {
			//Se estiver vazia, retorna a própria string original.
			return originalString;
		} else {
			return inversao(originalString.substring(1)) + originalString.substring(0, 1);
			/* Caso contrário, chama recursivamente a função inversao com uma substring que 
			 * exclui o primeiro caractere da string original, e depois concatena o primeiro 
			 * caractere da string original ao final do resultado da chamada recursiva. */
			
		}
		
	}

}
