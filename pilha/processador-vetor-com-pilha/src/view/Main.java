package view;

import controller.ProcessadorController;
import voltaic.guy.pilhaint.Pilha;

public class Main {

	/* 1. Considere o vetor a seguir:
	 * 
	 * 0 | 5 | 7 | -4 | 3 | 5 | -2 | -1 | 10 | 4 | 3 | -6 | 2 | -9 | 1 | -5
	 * 
	 * Fazer um algoritmo, em Java, utilizando a biblioteca PilhaInt, inicializar uma pilha de inteiros 
	 * e resolva conforme as condições:
	 * 		a. O vetor deve ser percorrido do primeiro ao último elemento.
	 * 		b. Caso seja um número positivo ou 0, fazer o push do valor.
	 * 		c. Caso seja um número negativo, fazer o pop de 2 valores, somá-los, fazer o push do número 
	 * 		   negativo e o push do resultado da soma.
	 * 		d. Ao término do vetor, apresentar a quantidade de valores presentes na pilha. */
	public static void main(String[] args) {
		
		ProcessadorController pc = new ProcessadorController();
		Pilha pilha = new Pilha();
		int[] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		int tamanho = vetor.length;
		pilha = pc.preencherPilha(vetor, tamanho, pilha);
		
		//d. Ao término do vetor, apresentar a quantidade de valores presentes na pilha.
		System.out.println("A quantidade de valores presentes na pilha é de: " + pilha.size());
		
		//Mostrar pilha
		int itemPilha = 0;
		while(!pilha.isEmpty()) {
			try {
				itemPilha = pilha.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			System.out.println("| " + itemPilha + " |");
		}
		
	}

}
