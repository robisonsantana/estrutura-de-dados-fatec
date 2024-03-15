package view;

import controller.TempoGastoController;

public class Main {

	/* Criar um projeto Java que receba as bibliotecas BubbleSort, MergeSort e QuickSort. 
	 * O projeto deve prever um vetor com 1500 posições ({1499, 1498, 1497, ..., 0}) e 
	 * apresentar o tempo de ordenação para cada um dos métodos. */
	public static void main(String[] args) {
		
		TempoGastoController tp = new TempoGastoController();
		
		int[] vetor = new int [1500];
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = (int) (Math.random() * 1000);
		}
		
		//Calcular tempo gasto para ordenar um vetor com Bubble Sort
		double tempoInicial = System.nanoTime();
		vetor = tp.bubbleSort(vetor);
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);	
		System.out.println("Bubble Sort -> " + tempoTotal + "s");
		
		//Calcular tempo gasto para ordenar um vetor com Merge Sort
		tempoInicial = System.nanoTime();
		vetor = tp.mergeSort(vetor);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("Merge Sort -> " + tempoTotal + "s");
		
		//Calcular tempo gasto para ordenar um vetor com Quick Sort
		tempoInicial = System.nanoTime();
		vetor = tp.quickSort(vetor);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("Quick Sort -> " + tempoTotal + "s");
	}

}
