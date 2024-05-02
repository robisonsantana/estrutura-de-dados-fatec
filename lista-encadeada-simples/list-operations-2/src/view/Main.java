package view;

import voltaic.guy.lista.*;
import controller.OperationsController;

public class Main {

	/* 3. Dada uma lista inicial L, conforme o exemplo abaixo, demonstre, com operações de lista, 
	 * como ficará L ao final das aplicações dos passos, como determinado abaixo:
	 * 
	 * 		Lista | 1 | -> | 2 | -> | 6 | -> | 7 | -> | 8 | -> null
	 * 
	 * Baseado no vetor abaixo:
	 * 
	 * 		Vetor:
	 * 		| 3 | 3 | 9 | 6 | 9 | 8 | 9 | 5 | 7 | 10 | 4 | 8 | 10 | 8 |
	 * 
	 * Para cada posição do vetor:
	 * 		• Se o valor já existe na lista, inserir no fim
	 * 		• Senão, se o valor for par, inserir na posição 2
	 * 		• Senão, se o valor for ímpar, inserir na posição 1 */
	public static void main(String[] args) {
		ILista<Integer> lista = new Lista<>();
		lista.addFirst(8);
		lista.addFirst(7);
		lista.addFirst(6);
		lista.addFirst(2);
		lista.addFirst(1);
		int[] vetor = {3, 3, 9, 6, 9, 8, 9, 5, 7, 10, 4, 8, 10, 8};
		
		OperationsController oc = new OperationsController(lista, vetor);
		
		//Mostrar lista original
		System.out.println("Lista Original:");
		oc.mostrarLista(lista);
		
		//Mostrar vetor
		System.out.println("\nVetor:");
		for(int i : vetor) {
			System.out.print("| " + i + " ");
		}
		System.out.print("|");
		
		lista = oc.operacoes();
		
		//Lista Final
		System.out.println("\nLista Final:");
		oc.mostrarLista(lista);
		
	}

}
