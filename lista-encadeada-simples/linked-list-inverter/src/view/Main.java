package view;

import voltaic.guy.lista.ILista;
import voltaic.guy.lista.Lista;
import controller.InverterController;

public class Main {

	/* b) Fazer, em Java, um novo projeto que insira a Lista L como acima e implemente operações
	 * que permita inverter os elementos da própria Lista e a exibição dos elementos */
	public static void main(String[] args) {
		
		InverterController ic = new InverterController();
		ILista<Integer> lista = new Lista<>();
		
		try {
			lista.addFirst(3);
			lista.addLast(5);
			lista.addLast(18);
			lista.addLast(12);
			lista.addLast(9);
			lista.addLast(7);
			lista.addLast(6);
			lista.addLast(2);
			lista.addLast(13);
			lista.addLast(4);
			lista.addLast(16);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Lista Original:");
		ic.mostrarLista(lista);
		ic.inverter(lista);
		System.out.println("\nLista Invertida:");
		ic.mostrarLista(lista);
	}

}
