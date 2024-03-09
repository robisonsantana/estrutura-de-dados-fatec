package controller;

import algoritmos.ordenacao.*;

public class OrdenacaoVetoresController {

	public OrdenacaoVetoresController() {
		super();
	}
	
	public int[] bubbleSort(int[] vetor) {
		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(vetor);
		return vetor;
	}
	
	public int[] mergeSort(int[] vetor) {
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(vetor, 0, vetor.length - 1);
		return vetor;
	}

}
