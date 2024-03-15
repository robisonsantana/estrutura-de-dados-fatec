package controller;

import algorithms.order.BubbleSort;
import algorithms.order.MergeSort;
import algorithms.order.QuickSort;

public class TempoGastoController {

	public TempoGastoController() {
		super();
	}
	
	public int[] bubbleSort(int[] vetor) {
		
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(vetor);
		return vetor;
	}
	
	public int[] mergeSort(int[] vetor) {
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(vetor, 0, vetor.length - 1);
		return vetor;
	}
	
	public int[] quickSort(int[] vetor) {
		
		QuickSort qs = new QuickSort();
		qs.quickSort(vetor, 0, vetor.length - 1);
		return vetor;
	}

}
