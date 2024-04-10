package view;

import javax.swing.JOptionPane;
import controller.ImpressoraController;
import voltaic.guy.Fila;
import model.Documento;

public class Main {

	/* 4. Criar um projeto Java que implementa com a biblioteca Fila Genérica para simular um ambiente corporativo, 
	 * comum, como agências bancárias que tem diversos computadores e 1 impressora central. Nesses casos, a 
	 * impressora tem uma fila de impressões para que cada documento enviado comece e termine a impressão sem que 
	 * documentos se misturem. A aplicação deve ter uma classe no package controller, ImpressoraController que tem 
	 * os seguintes métodos:
	 * 
	 * 		- insereDocumento(Fila f, String documento): void, o documento no formato ID_PC;Nome_Arquivo (Já validado 
	 * 		  antes do envio) deverá enfileirar os documentos enviados.
	 * 		- imprime(Fila f):void, que desenfilera um documento da fila, por vez, exibe no console 
	 * 		  [#PC: ID_PC – Arquivo: Nome_Arquivo]. Cada impressão dura de 1 a 2 segundos usar Math.random() ou a classe 
	 * 		  Random e um Thread.sleep*(tempo) para simular o tempo de impressão. Exibir uma exceção caso não haja documento 
	 * 		  na fila de impressão.
	 * 
	 * Deve ter também uma classe Principal no package view com operações usando JOptionPane que permita ao usuário 
	 * inserir e validar os documentos de entrada e iniciar um procedimento de impressão. A aplicação deve rodar até 
	 * uma opção de saída ser selecionada pelo usuário.
	 * 
	 * * Como a classe de ImpressoraController não é uma Thread, para forçar um sleep, deve-se usar uma chamada estática 
	 * da classe Thread (Thread.sleep(tempo)) */
	public static void main(String[] args) {
		
		//Fila do tipo Objeto Documento
		Fila<Documento> documentos = new Fila<>();
		ImpressoraController impressora = new ImpressoraController();
		int codigo = 0;
		while(codigo != 9) {
			
			codigo = Integer.parseInt(JOptionPane.showInputDialog("IMPRESSÃO \n\n"
																+ "1- Insira documentos \n"
																+ "2- Imprimir \n"
																+ "9- Fechar"));
			switch(codigo){
			case 1:
				String entrada = JOptionPane.showInputDialog("Digite o documento (ID_PC;Nome_Arquivo):");
				
				//Verifica se o documento está no formato desejado
				if(entrada.matches("^[0-9]+;.*$")) {
					impressora.insereDocumento(documentos, entrada);
				} else {
					JOptionPane.showMessageDialog(null, "Formato inválido!");
				}
				break;
			case 2:
				impressora.imprime(documentos);
				break;
			case 9:
				//Sair
				break;
			default: JOptionPane.showMessageDialog(null, "Comando inválido!");
			}
		}
	}

}
