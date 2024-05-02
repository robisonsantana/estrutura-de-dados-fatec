package view;

import voltaic.guy.lista.*;
import controller.OrdenacaoController;

public class Main {

	/* Implementar, em Java, um projeto que inicie a Lista L como apresentada acima e, 
	 * faça sua ordenação e exiba ordenada. Permitido usar bibliotecas de outras TADs */
	public static void main(String[] args) {
		ILista<Integer> list = new Lista<>();
		list.addFirst(10);
		try {
			list.addLast(5);
			list.addLast(8);
			list.addLast(1);
			list.addLast(9);
			list.addLast(2);
			list.addLast(4);
			list.addLast(7);
			list.addLast(3);
			list.addLast(6);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		OrdenacaoController oc = new OrdenacaoController();
		oc.sort(list);
	}

}
