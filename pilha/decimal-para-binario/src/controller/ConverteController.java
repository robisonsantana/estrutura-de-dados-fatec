package controller;

import voltaic.guy.pilhaint.Pilha;

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	//Método que chama os processos de divisão e concatenação
	public String decToBin(int decimal) throws Exception {
		
		Pilha pilha = new Pilha();
		divBinaria(decimal, pilha);
		return retornaBinario(pilha);
		
	}
	
	//Método para fazer a divisão de decimal para binário
	private void divBinaria(int decimal, Pilha pilha) {
		while(decimal > 0) {
			int resto = decimal % 2;
			decimal /= 2;
			pilha.push(resto);
		}
	}
	
	//Método para concatenar os valores armazenados na pilha
	private String retornaBinario(Pilha pilha) throws Exception {
		String numeroString = "";
		while(!pilha.isEmpty()) {
			numeroString += String.valueOf(pilha.pop());			
		}
		return numeroString;
	}

}
