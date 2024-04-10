package controller;

import model.Processo;
import voltaic.guy.Fila;

public class EscalonadorController {
	
	public EscalonadorController() {
		
	}
	
	//Método que verifica quantos processos faltam e aplica o que foi pedido
	public Fila escalonador (Fila filaProcesso) {
		Fila<Object> filaAux = new Fila<>();
		while(!filaProcesso.isEmpty()) {
			try {
				Processo processo = (Processo)filaProcesso.remove();
				if(processo.qtdRetornos > 1) {
					processo.qtdRetornos--;
					filaAux.insert(processo);
				} else {
					filaProcesso.remove();
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return filaAux;
	}

}
