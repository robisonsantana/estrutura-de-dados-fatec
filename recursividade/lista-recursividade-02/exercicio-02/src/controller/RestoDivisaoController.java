package controller;

public class RestoDivisaoController {
	
	public RestoDivisaoController() {
		super();
	}
	
	public int resto(int dividendo, int divisor) {
		
		//Condição de parada -> Quando o "dividendo" for menor que o "divisor"
		if(dividendo < divisor) {
			return dividendo;
		} else {
			return resto(dividendo - divisor, divisor);
			/* O retorno é gerado pela chamada recursiva da função, 
			 * onde o dividendo é subtraído pelo divisor. */
			
		}
		
	}

}
