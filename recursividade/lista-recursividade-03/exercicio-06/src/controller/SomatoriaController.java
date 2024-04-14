package controller;

public class SomatoriaController {
	
	public SomatoriaController() {
		super();
	}
	
	public double somatoria(double numero) {
		
		//Condição de Parada -> Quando o numero se iguala a 1.
		if(numero == 1) {
			return 1;
		} else {
			return 1 /  fatorial(numero) + somatoria(numero - 1);
			/* O retorno é calculado pela divisão de 1 pela chamada recursiva da função 
			 * "fatorial" com o parâmetro "numero", somado à chamada recursiva da função 
			 * "somatoria" com o parâmetro "numero" subtraído de 1. */
		}
		
	}
	
	public double fatorial(double numero) {
		
		//Condição de Parada -> Quando o numero se iguala a 1.
		if(numero == 1) {
			return 1;
		} else {
			return numero * fatorial(numero - 1);
			/* O retorno ocorre através da chamada recursiva da função, onde o parâmetro 
			 * "numero" é decrementado em 1 e multiplicado pela própria variável "numero". */
		}
		
	}

}
