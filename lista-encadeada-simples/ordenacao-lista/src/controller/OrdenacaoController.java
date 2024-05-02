package controller;

import voltaic.guy.lista.*;
import algorithms.order.QuickSort;

public class OrdenacaoController {
	
	public OrdenacaoController() {
		super();
	}
	
	public void sort(ILista list) {
		System.out.println("Lista Original:");
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println(list.get(i));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		int[] vetor = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			try {
				vetor[i] = (int) list.get(i);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		while(!list.isEmpty()) {
			try {
				list.removeFirst();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		QuickSort qs = new QuickSort();
		qs.quickSort(vetor, 0, vetor.length - 1);
		list.addFirst(vetor[0]);
		for(int i = 1; i < vetor.length; i++) {
			try {
				list.add(vetor[i], i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
		}
		System.out.println("\nLista Ordenada:");
		for(int i = 0; i < list.size(); i++) {
			try {
				System.out.println(list.get(i));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
