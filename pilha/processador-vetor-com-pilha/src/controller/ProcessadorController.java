package controller;

import voltaic.guy.pilhaint.Pilha;

public class ProcessadorController {
	
	public ProcessadorController() {
		super();
	}
	
	public Pilha preencherPilha(int[] vetor, int tamanho, Pilha pilha) {
		
		int pop1 = 0;
		int pop2 = 0;
		int soma = 0;
		
		//a. O vetor deve ser percorrido do primeiro ao último elemento.
		for(int i = 0; i < tamanho; i++) {
			
			//b. Caso seja um número positivo ou 0, fazer o push do valor.
			if(vetor[i] >= 0) {
				pilha.push(vetor[i]);
				
			/* c. Caso seja um número negativo, fazer o pop de 2 valores, somá-los, 
			 * fazer o push do número negativo e o push do resultado da soma. */
			} else {
				try {
					pop1 = pilha.pop();
					pop2 = pilha.pop();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				
				soma = pop1 + pop2;
				pilha.push(vetor[i]);
				pilha.push(soma);
			}
		}
		return pilha;
	}

}
