package view;

import controller.ParesController;

public class ParesMain {
	
	/* 3. Construir uma função recursiva que receba um vetor e seu 
	 * tamanho e apresente a quantidade de números pares existentes 
	 * no vetor. Considere que a entrada deve ser, apenas de números 
	 * naturais diferentes de zero. */
	public static void main(String[] args) {
		
		int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int tamanho = vetor.length - 1;
		int pares = 0;
		
		ParesController pc = new ParesController();
		System.out.println("A quantidade de valores pares no vetor é de " + pc.quantidadePares(vetor, tamanho, pares) + " números.");
		
	}

}
