package controller;

import voltaic.guy.pilhaint.Pilha;

public class FatController {
	
	public Pilha p = new Pilha();

	public FatController() {
		super();
	}
	
	public int fatorial(int num) {
		
		preencherPilha(num);
		return calcular();
	}
	
	private void preencherPilha(int num) {
		
		while(num > 0) {
			p.push(num);
			num--;
		}
	}
	
	private int calcular() {
		int fat = 1;
		while(!p.isEmpty()) {
			try {
				fat *= p.pop();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
		return fat;
	}

}
