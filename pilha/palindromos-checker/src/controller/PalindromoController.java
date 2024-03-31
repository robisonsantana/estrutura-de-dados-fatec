package controller;

import voltaic.guy.pilhastrings.Pilha;

public class PalindromoController {
	
	private String palavraInvertida = "";
	public PalindromoController() {
		super();
	}
	
	//Comparando palavras
	public boolean comparaPalavras(String palavra) {
		invertePalavra(palavra);
		if(palavra.equals(palavraInvertida)) {
			return true;
		} else {
			return false;
		}
	}
	
	private String invertePalavra(String palavra) {
		
		//Dividir a palavra num vetor de Strings
		String[] palavraDividida = palavra.split("");
		int tamanho = palavraDividida.length;
		
		Pilha pilha = new Pilha();
		
		//Preenchendo pilha com os elementos do vetor criado
		for(int i = 0; i < tamanho; i++) {
			pilha.push(palavraDividida[i]);
		}
		
		//Concatenando as letras da pilha numa String
		while(!pilha.isEmpty()) {
			try {
				palavraInvertida += pilha.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return palavraInvertida;
		
	}
	

}
