package controller;

import voltaic.guy.pilhaint.Pilha;

public class NPRController {
	
	private int op1;
	private int op2;
	private int resultado;
	private Pilha pilhaAux = new Pilha();
	
	public NPRController() {
		super();
	}
	
	//Insere elementos na pilha
	public void insereValor(Pilha pilha, int valor) {
		pilha.push(valor);
	}
	
	//Realizar cálculo
	public Integer nrp(Pilha pilha, String operador) {
		
		//Confere se o caractere digitado pelo usuário é um dos operadores
		if(operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")) {
			
			try {
				
				//Se verdadeiro, tenta desempilhar dois elementos da pilha para realizar a operação
				op1 = pilha.pop();
				op2 = pilha.pop();
				
			} catch (Exception e) {
				//Caso não haja elementos o suficiente para desempilhar, printa a mensagem e retorna null
				System.err.println("ERRO");
				return null;
			} 
			
			//Operações
			switch(operador) {
			case "+":
				 resultado = op1 + op2;
				break;
			case "-":
				resultado = op2 - op1;
				break;
			case "*":
				resultado = op1 * op2;
				break;
			case "/":
				resultado = op2 / op1;
				break;
			}
			//Adiciona o resultado a pilha e o retorna
			pilha.push(resultado);
			return resultado;
			
		} else {
			//Caso o caractere digitado pelo usuário não seja um dos operadores, printa um erro e retorns null
			System.err.println("ERRO");
			return null;
		}
		
	}
	
	//Mostrar pilha
	public void mostrarPilha(Pilha pilha) {
		int tamanho = pilha.size();
		int item = 0;
		
		//Desempilha a pilha original e mostra seus elementos, enquanto o valor retirado é adcionado numa pilha auxiliar
		for(int i = 0; i < tamanho; i++) {
			try {
				item = pilha.pop();
				pilhaAux.push(item);
				System.out.println("| " + item + " |");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		//Devolve os itens armazenados na pilha auxiliar para a pilha original
		for(int i = 0; i < tamanho; i++) {
			try {
				item = pilhaAux.pop();
				pilha.push(item);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
