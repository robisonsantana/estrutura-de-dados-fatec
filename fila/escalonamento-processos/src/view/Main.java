package view;

import voltaic.guy.Fila;
import model.Processo;
import controller.EscalonadorController;

public class Main {

	/* 3. Considerando a biblioteca Fila Genérica, já criada, faça:
	 * Criar um projeto Java (EscalonamentoProcessos) e importe a biblioteca FilaObject. Esse novo projeto 
	 * irá receber Objectos com dados de processos com o formato do objecto abaixo e simular o escalonamento 
	 * de processos RoundRobin.
	 * 
	 * A classe EscalonadorController no package controller deve ter 1 método:
	 * 		• O método escalonador que recebe uma Fila de processos, como parâmetros, verifica se o número que 
	 * 		  vezes é maior que 1, decrementa esse valor no objeto e, se for maior que 1, insere o objeto 
	 * 		  novamente na fila;
	 * 
	 * A classe Principal, no package view, no seu método Main, deve inicializar uma fila Com processos, como 
	 * no exemplo abaixo
	 * 
	 * Objeto:
	 * 		-----------------------
	 * 			   Processo
	 * 		-----------------------
	 * 			+Nome:String
	 * 			+QtdRetornos:Int
	 * 		-----------------------
	 * 
	 * Exemplo de entrada:
	 * {"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52","firefox.exe;18","word.exe;25"} */
	public static void main(String[] args) {
		
		//Cria-se a fila 
		Fila<Processo> filaProcesso = new Fila<>();
		
		//Vetor com os nomes dos processos simulados
		String[] processos = {"notepad.exe", "write.exe", "chrome.exe", "acrobat.exe", "firefox.exe", "word.exe"};
		
		//Preenchendo fila de forma aleatória
		int tamanho = processos.length;
		for(int i = 0; i < tamanho; i++){
			String nomeProcesso = processos[i];
			int quantidade = (int)(Math.random() * 50);
			Processo processo = new Processo(nomeProcesso, quantidade);
			filaProcesso.insert(processo);
		}
		
		//Chamando método escalonador e mostrando quantos faltam após o procedimento pedido
		EscalonadorController escalonador = new EscalonadorController();
		filaProcesso = escalonador.escalonador(filaProcesso);
		while(!filaProcesso.isEmpty()) {
			try {
				Object x = filaProcesso.remove();
				System.out.println(x);
			} catch (Exception e) {
				System.err.println();
			}
		}
	}

}
