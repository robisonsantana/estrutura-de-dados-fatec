package controller;

public class FatorialDuploController {
	
	public FatorialDuploController() {
		super();
	}
	
	public int fatorialDuplo(int numero) {
		
		//Condição de parada -> Quando o numero chegar a 1.
		if(numero == 1) {
			return numero;
		} else {
			return numero * fatorialDuplo(numero - 2);
			/* O retorno é calculado multiplicando o número pela chamada 
			 * recursiva da função, onde o número é subtraído por 2 antes 
			 * de ser passado novamente para a função. */
		}
	}

}
