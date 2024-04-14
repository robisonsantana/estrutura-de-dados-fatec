package controller;

public class ElementosNegativosController {
	
	//Método Construtor:
	public ElementosNegativosController() {
		super();
	}
	
	//Função recursiva para somar a quantidade de números negativos em um vetor:
	public int elementosNegativos(int[] vetor, int tamanho, int quantidadeNegativos) {
		
		//Condição de parada -> Quando não houver mais posições no vetor.
		if(tamanho == 0) {
			return 0;
		} else {
			tamanho--;
			int valor = vetor[tamanho];
			if(valor < 0) {
				return 1 + elementosNegativos(vetor, tamanho, quantidadeNegativos);	
			} else {
				return elementosNegativos(vetor, tamanho, quantidadeNegativos);
				//Os retornos da função são determinados da seguinte maneira:
				//se o valor for negativo, adiciona-se 1 à soma e a função é 
				//chamada com o tamanho reduzido em 1. Se o valor for positivo, 
				//a função é chamada sem alterações na soma e com o tamanho 
				//reduzido em 1.
				
			}
			
		}
		
	}

}
