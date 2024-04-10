package controller;

import voltaic.guy.Fila;
import javax.swing.JOptionPane;

public class IdentificadorController {
	
	public IdentificadorController() {
		super();
	}
	
	//Método para inserir uma nova ligação
	public void insereLigacao(Fila chamadas, String numeroTelefone) {
		long numero = (long)((Math.random() * 999999999) + 100000000);
		numeroTelefone = Long.toString(numero);
		chamadas.insert(numeroTelefone);
		JOptionPane.showMessageDialog(null, "Número adicionado!");
	}
	
	//Método para mostrar as chamadas perdidas
	public void consultaLigacoes(Fila chamadas) {
		if(chamadas.isEmpty()) {
			System.err.println("Não há chamadas perdidas.");
		} else {
			while(!chamadas.isEmpty()) {
				try {
					Object numero = chamadas.remove();
					System.err.println("Chamada perdida: " + numero);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}

}
