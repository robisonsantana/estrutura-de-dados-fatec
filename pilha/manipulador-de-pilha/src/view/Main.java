package view;

import controller.ManipuladorController;
import voltaic.guy.pilhastrings.Pilha;

public class Main {

	/* 2. Considere a pilha abaixo, já formada.
	 * 
	 * | W | 
	 * | L |
	 * | H |
	 * | B |
	 * | R |
	 * | G |
	 * | J |
	 * 
	 * Demonstrando em código ou teste de mesa, criar uma sequência 
	 * de operações de pilha que dê a seguinte saída:
	 * 
	 * Console: R W			Pilha Final:
	 * 							| K |
	 *  						| G |
	 * 							| M |
	 * 							| B |
	 * 							| L | 
	 * */
	public static void main(String[] args) {
		
		ManipuladorController mc = new ManipuladorController();
		Pilha pilha = new Pilha();
		
		//Preenchendo pilha
		pilha.push("J");
		pilha.push("G");
		pilha.push("R");
		pilha.push("B");
		pilha.push("H");
		pilha.push("L");
		pilha.push("W");
		
		pilha = mc.manipuladorPilha(pilha);
		
		//Saída do console
		String letra = "";
		for(int i = 0; i < 2; i++) {
			try {
				letra = pilha.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			System.out.print(letra + " ");
		}
		
		//Pilha final
		letra = "";
		System.out.println("\n\nPilha Final:");
		while(!pilha.isEmpty()) {
			try {
				letra = pilha.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			System.out.println("| " + letra + " |");
			
		}

	}

}
