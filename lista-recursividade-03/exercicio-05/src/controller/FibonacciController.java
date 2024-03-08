package controller;

public class FibonacciController {
	
	public FibonacciController() {
		super();
	}
	
	public int fibonacci(int posicao) {
		
		//Condição de Parada -> Quando a posição for igual a 1 ou 2.
		if(posicao == 1 || posicao == 2) {
			return 1;
		} else {
			return fibonacci(posicao - 1) + fibonacci(posicao - 2);
			/* O retorno é obtido pela soma das chamadas recursivas da mesma função, 
			 * uma vez com o parâmetro "posicao" subtraído por 1 e outra vez com o 
			 * parâmetro "posicao" subtraído por 2, continuando esse processo até que 
			 * a condição de parada seja alcançada. */
		}
	}

}
