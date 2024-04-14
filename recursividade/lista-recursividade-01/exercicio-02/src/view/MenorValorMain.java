package view;

import controller.MenorValorController;

public class MenorValorMain {
	
	//2. Criar uma aplicação em Java que tenha uma função recursiva que, 
	//recebendo um vetor de inteiros, o tamanho do vetor e o valor da última 
	//posição do vetor como o primeiro menor valor, retorne o menor valor 
	//contido neste vetor.
	public static void main(String[] args) {
		
		int vetor[] = {4, 2, 8, 6, 9, 1, 7};
		int tamanho = vetor.length;
		int menor = vetor[tamanho - 1];
		
		MenorValorController mvc = new MenorValorController();
		int menorValor = mvc.menorValor(vetor, tamanho, menor);
		System.out.println(menorValor);
		
	}
	
}
