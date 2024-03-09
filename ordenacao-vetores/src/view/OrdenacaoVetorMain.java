package view;

import controller.OrdenacaoVetoresController;

public class OrdenacaoVetorMain {

	//Código para mostrar funcionamento da biblioteca:
	public static void main(String[] args) {
		
		OrdenacaoVetoresController ovc = new OrdenacaoVetoresController();
		
		int[] vetorA = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetorB = {44, 43, 42, 41, 40, 39, 38};
		
		int tamanho = vetorA.length - 1;
		System.out.println("Vetor original:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		
		//Ordenação vetor com Bubble Sort:
		vetorA = ovc.bubbleSort(vetorA);
		System.out.println("\nVetor ordenado:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		
		tamanho = vetorB.length - 1;
		System.out.println("\n\nVetor original:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorB[i] + " | ");
		}
		
		//Ordenação vetor com Merge Sort:
		vetorA = ovc.mergeSort(vetorB);
		System.out.println("\nVetor ordenado:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorB[i] + " | ");
		}
		
	}
}
