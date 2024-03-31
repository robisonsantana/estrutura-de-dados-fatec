package controller;

import voltaic.guy.pilhastrings.Pilha;

public class ManipuladorController {
	
	private String R;
	private String W;
	private String aux;
	private Pilha pilhaAux = new Pilha();
	
	public ManipuladorController() {
		super();
	}
	
	public Pilha manipuladorPilha(Pilha pilha) {
		try {
			W = pilha.pop();
			aux = pilha.pop();
			pilhaAux.push(aux);
			pilha.pop();
			aux = pilha.pop();
			pilhaAux.push(aux);
			R = pilha.pop();
			pilhaAux.push("M");
			aux = pilha.pop();
			pilhaAux.push(aux);
			pilha.pop();
			pilhaAux.push("K");
			pilhaAux.push(W);
			pilhaAux.push(R);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return pilhaAux;
		
	}

}
