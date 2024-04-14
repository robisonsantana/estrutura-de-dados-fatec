package controller;

public class ParesController {
	
	public ParesController() {
		super();
	}
	
	public int quantidadePares(int[] vetor, int tamanho, int pares) {
		
		//Condição de parada -> Quando o tamanho chegar a 0.
		if(tamanho == 0) {
			return pares;
		} else {
			if(vetor[tamanho] % 2 == 0) {
				pares++;
				return quantidadePares(vetor, tamanho - 1, pares);
			} else {
				return quantidadePares(vetor, tamanho - 1, pares);
				/* O retorno é obtido pela chamada recursiva da função, 
				 * onde o parâmetro "tamanho" é subtraído por 1. */
				
			}
			
		}
		
	}

}
