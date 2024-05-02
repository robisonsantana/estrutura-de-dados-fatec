package controller;

import voltaic.guy.lista.*;

public class OperationsController {
	
	private ILista<Integer> lista = new Lista<>();
	private int[] vetor;
	
	public OperationsController(ILista lista, int[] vetor) {
		this.lista = lista;
		this.vetor = vetor;
	}
	
	public void mostrarLista(ILista lista) {
		for(int i = 0; i < lista.size(); i++) {
			try {
				System.out.print("| " + lista.get(i) + " | -> ");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		System.out.print("null");
	}
	
	public ILista operacoes() {
		for(int i : vetor) {
			if(existe(i)) {
				try {
					lista.addLast(i);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			} else if( i % 2 == 0) {
				try {
					lista.add(i, 2);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			} else {
				try {
					lista.add(i, 1);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		
		return lista;
	}
	
	private boolean existe(int posicao) {
		for(int i = 0; i < lista.size(); i++) {
			try {
				if(lista.get(i).equals(posicao)) {
					return true;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return false;
	}
	

}
