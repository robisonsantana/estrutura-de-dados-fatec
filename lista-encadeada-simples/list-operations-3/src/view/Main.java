package view;

import controller.OperationsController;
import voltaic.guy.lista.*;

public class Main {

	/* b) Fazer, em Java, um novo projeto que inicialize a lista L, com os dados acime e 
	 * implemente operações que permitam determinar os 2 maiores valores da lista. O 
	 * uso de bibliotecas de outros TADs é permitido */
	public static void main(String[] args) {
		
		ILista<Integer> lista = new Lista<>();
		
		lista.addFirst(16);
		lista.addFirst(7);
		lista.addFirst(3);
		lista.addFirst(2);
		lista.addFirst(6);
		lista.addFirst(7);
		lista.addFirst(9);
		lista.addFirst(12);
		lista.addFirst(8);
		lista.addFirst(5);
		lista.addFirst(3);
		
		OperationsController op = new OperationsController();
		op.maiorMenor(lista);

	}

}
