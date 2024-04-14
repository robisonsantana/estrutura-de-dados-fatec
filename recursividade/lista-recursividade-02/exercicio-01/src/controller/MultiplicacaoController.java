package controller;

public class MultiplicacaoController {
	
	public MultiplicacaoController() {
		super();
	}
	
	public int multiplicacao(int numeroA, int numeroB) {
		
		//Condição de retorno -> Quando o "numeroB" chegar a 1.
		if(numeroB == 1) {
			return numeroA;
		} else {
			return numeroA + multiplicacao(numeroA, numeroB - 1);
			/* O retorno é obtido pela soma do valor de "numeroA" com
			 * a chamada recursiva da função, onde o parâmetro "numeroB"
			 * é subtraído por 1. */
			
		}
		
	}

}
