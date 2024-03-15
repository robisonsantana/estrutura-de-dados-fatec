package controller;

import algorithms.order.BubbleSort;
import algorithms.order.MergeSort;
import algorithms.order.QuickSort;

public class OrderingController {

	public OrderingController() {
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
	
	public int[] quickSort(int[] vetor) {
		
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(vetor, 0, vetor.length - 1);
		return vetor;
	}

}
