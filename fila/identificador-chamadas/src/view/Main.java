package view;

import javax.swing.JOptionPane;
import controller.IdentificadorController;

import voltaic.guy.Fila;

public class Main {

	/* 2. Criar um projeto Java que implementa com a biblioteca Fila Genérica para simular um identificador 
	 * de chamadas telefônicas enquanto o aparelho está fora da rede ou desligado. A aplicação deve ter uma 
	 * classe no package controller, TelefoneController que tem os seguintes métodos:
	 * 
	 * 		- insereLigacao(Fila f, String numeroTelefone): void, que insere números de telefone em uma 
	 * 		  fila iniciada
	 * 		- consultaLigacoes(Fila f):void, que desenfilera cada ligação realizada e exibe no console. 
	 * 		  Exibir uma exceção caso não haja ligação
	 * 
	 * Deve ter também uma classe Principal no package view com operações usando JOptionPane que permita ao 
	 * usuário inserir números e consultar as chamadas perdidas. A aplicação deve rodar até uma opção de 
	 * saída ser selecionada pelo usuário */
	public static void main(String[] args) {
		
		IdentificadorController identificador = new IdentificadorController();
		
		Fila<String> chamadas = new Fila<>();
		String numeroChamada = "";
		
		int controller = 0;
		while(controller != 9) {
			
			controller = Integer.parseInt(JOptionPane.showInputDialog("Menu \n\n"
																	+ "1- Inserir chamada \n"
																	+ "2- Mostrar chamadas \n"
																	+ "9- Sair"));
			
			switch(controller) {
			case 1:
				identificador.insereLigacao(chamadas, numeroChamada);
				break;
			case 2:
				identificador.consultaLigacoes(chamadas);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Programa finalizado!");
				break;
			default: JOptionPane.showMessageDialog(null, "Comando inválido!!");
			}
		}
		

	}

}
