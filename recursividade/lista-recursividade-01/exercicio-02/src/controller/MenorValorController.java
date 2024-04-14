package controller;

public class MenorValorController {
	
	//Método Construtor:
	public MenorValorController() {
		super();
	}
	
	//Função recursiva para encontrar o menor valor em um vetor:
	public int menorValor(int[] vetor, int tamanho, int menor) {
		
		//Condição de parada -> Quando o vetor não tiver mais posições.
		if(tamanho == 0) {
			return menor;
		} else {
			int ultimaPosicao = tamanho - 1;
			int valor = vetor[ultimaPosicao];
			tamanho--;
			if(valor < menor) {
				menor = valor;
				return menorValor(vetor, tamanho, menor);
			} else {
				return menorValor(vetor, tamanho, menor);
				//Os retornos são obtidos chamando a própria função com 
				//o tamanho reduzido em 1, com o objetivo de percorrer 
				//todas as posições do vetor e retornar a de menor valor.
			}
			
		}
		
	}
	
}
