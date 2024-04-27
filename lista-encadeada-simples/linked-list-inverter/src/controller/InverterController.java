package controller;

import voltaic.guy.lista.ILista;
import voltaic.guy.pilhaint.Pilha;

public class InverterController {
	
	public InverterController() {
		super();
	}
	
	public void inverter(ILista<Integer> lista) {
		Pilha pilha = new Pilha();
		try {
			while(!lista.isEmpty()) {
				pilha.push(lista.get(0));
				lista.removeFirst();
			}
			
			lista.addFirst(pilha.pop());
			while(!pilha.isEmpty()) {
				lista.addLast(pilha.pop());
			}
			
			

		} catch (Exception e) {
			System.err.println();
		}
	}
	
	public void mostrarLista(ILista<Integer> lista) {
		for(int i = 0; i < 11; i++) {
			try {
				System.out.println(lista.get(i));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
