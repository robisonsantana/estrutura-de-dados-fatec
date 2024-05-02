package controller;

import voltaic.guy.lista.*;

public class OperationsController {
	
	public OperationsController() {
		super();
	}
	
	public ILista interseccoes(ILista a, ILista b, ILista i) {
		for(int x = 0; x < a.size(); x++) {
			for(int y = 0; y < b.size(); y++) {
				try {
					if(a.get(x) == b.get(y)) {
						i.addFirst(a.get(x));
					}
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		
		return i;
	}
	
	public ILista uniao(ILista a, ILista b, ILista u) {
		for(int x = 0; x < a.size(); x++) {
			try {
				u.addFirst(a.get(x));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		for(int x = 0; x < b.size(); x++) {
			try {
				u.addFirst(b.get(x));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return u;
	}
	
	public void mostrarListas(ILista lista) {
		for(int x = 0; x < lista.size(); x++) {
			try {
				System.out.println(lista.get(x));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
