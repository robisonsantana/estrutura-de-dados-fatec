package view;

import controller.OrderingController;

public class OrderingMain {

	//Código para mostrar funcionamento da biblioteca:
	public static void main(String[] args) {
		
		OrderingController ovc = new OrderingController();
		
		int[] vetorA = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetorB = {44, 43, 42, 41, 40, 39, 38};
		int[] vetorC = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetorD = {44, 43, 42, 41, 40, 39, 38};
		int[] vetorE = {31, 32, 33, 34, 99, 98, 97, 96};
		
		//Mostrar vetor original
		int tamanho = vetorA.length - 1;
		System.out.println("Vetor 'A' original:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		
		//Ordenação vetor com Bubble Sort:
		vetorA = ovc.bubbleSort(vetorA);
		System.out.println("\nVetor ordenado:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		
		//Mostrar vetor original
		tamanho = vetorB.length - 1;
		System.out.println("\n\nVetor 'B' original:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorB[i] + " | ");
		}
		
		//Ordenação vetor com Merge Sort:
		vetorA = ovc.mergeSort(vetorB);
		System.out.println("\nVetor ordenado:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorB[i] + " | ");
		}
		
		//Mostrar vetor original
		tamanho = vetorC.length - 1;
		System.out.println("\n\nVetor 'C' original:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorC[i] + " | ");
		}
		
		//Ordenação vetor com Quick Sort:
		vetorC = ovc.quickSort(vetorC);
		System.out.println("\nVetor ordenado:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorC[i] + " | ");
		}
		
		//Mostrar vetor original
		tamanho = vetorD.length - 1;
		System.out.println("\n\nVetor 'D' original:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorD[i] + " | ");
		}
		
		//Ordenação vetor com Quick Sort:
		vetorD = ovc.quickSort(vetorD);
		System.out.println("\nVetor ordenado:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorD[i] + " | ");
		}
		
		//Mostrar vetor original
		tamanho = vetorE.length - 1;
		System.out.println("\n\nVetor 'E' original:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorE[i] + " | ");
		}
		
		//Ordenação vetor com Quick Sort:
		vetorE = ovc.quickSort(vetorE);
		System.out.println("\nVetor ordenado:");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetorE[i] + " | ");
		}
		
	}
}
