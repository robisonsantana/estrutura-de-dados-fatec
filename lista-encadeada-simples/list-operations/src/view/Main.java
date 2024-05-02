package view;

import voltaic.guy.lista.*;
import controller.OperationsController;

public class Main {

	/* a) Criar a sequência de passos para criar a lista I e a lista U onde:
	 * i. I é a lista com a intersecção das listas A e B
	 * ii. U é a lista com a união de A e B
	 * b) Fazer, em Java, um novo projeto que inicialize as listas A e B e tenha
	 *  métodos que gere e imprima as listas I e U. */
	public static void main(String[] args) {
		ILista<Integer> a = new Lista<>();
		ILista<Integer> b = new Lista<>();
		ILista<Integer> i = new Lista<>();
		ILista<Integer> u = new Lista<>();
		
		//Preenchendo lista
		a.addFirst(3);
		b.addFirst(9);
		try {
			a.addLast(5);
			a.addLast(8);
			a.addLast(12);
			a.addLast(9);
			a.addLast(7);
			a.addLast(16);
			b.addLast(6);
			b.addLast(2);
			b.addLast(3);
			b.addLast(7);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		OperationsController oc = new OperationsController();
		System.out.println("Lista A:");
		oc.mostrarListas(a);
		System.out.println("\nLista B:");
		oc.mostrarListas(b);
		
		i = oc.interseccoes(a, b, i);
		System.out.println("\nLista I:");
		oc.mostrarListas(i);
		
		u = oc.uniao(a, b, u);
		System.out.println("\nLista U:");
		oc.mostrarListas(u);
		
	}

}
