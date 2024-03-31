package view;

import javax.swing.JOptionPane;

import controller.HistoricoController;
import voltaic.guy.pilhastrings.Pilha;

public class HistoricoMain {

	/* 5. Considerando a biblioteca PilhaString, já criada, faça:
	 * 
	 * Criar um projeto Java (HistoricoSim) e importe a biblioteca PilhaStrings. Esse novo projeto simulará 
	 * uma função presente nos navegadores Web, a função de histórico.
	 * 
	 * A função de histórico empilha os endereços de sites acessados.
	 * 
	 * A classe Principal, no package view, deve ter na Main, a criação de uma Pilha denominada histórico e 
	 * deve dar ao usuário a possibilidade de inserir um novo endereço no histórico, remover o último endereço 
	 * da pilha, saber qual foi o último endereço visitado. Um menu deve ser criado.
	 * 
	 * A classe HistoricoController deve ter os métodos de validação das operações oferecidas na Main da Classe 
	 * Principal. Todos os métodos devem receber a pilha criada no método Main como parâmetro.
	 * 
	 * 		• O método de inserir um novo endereço, deve-se verificar antes, se o endereço é válido (um endereço válido começa com http:// e, na sequência, deve ter algo no formato www.endereço.com (podendo ser, .com, .co.uk, .com.br, etc.). Não serão aceitos sites sem www;
	 * 		• O método de remover o último endereço deve dar um erro se o histórico estiver vazio ou desempilhar o último endereço;
	 * 		• O método de consultar o último endereço, deve dar um erro se o histórico estiver vazio ou apresentar o último endereço, sem removê-lo. */
	public static void main(String[] args) {
		
		HistoricoController hc = new HistoricoController();
		Pilha historico = new Pilha();
		
		//Adicionando alguns endereços de antemão
		historico.push("https://www.twitter.com");
		historico.push("https://www.youtube.com");
		historico.push("https://www.amazon.com");
		historico.push("https://www.wikipedia.org");
		historico.push("https://www.facebook.com");
		historico.push("https://www.google.com");

		//Menu de acesso ao histórico
		int controller = 0;
		while(controller != 9) {
			
			controller = Integer.parseInt(JOptionPane.showInputDialog("MENU HISTÓRICO \n\n"
																	+ "1- Inserir nova URL \n"
																	+ "2- Remover última URL \n"
																	+ "3- Mostrar última URL \n"
																	+ "4- Histórico completo \n"
																	+ "5- Apagar histórico \n"
																	+ "9- Fechar histórico"));
			switch(controller) {
			case 1:
				hc.addURL(historico);
				break;
			case 2:
				hc.removerURL(historico);
				break;
			case 3:
				hc.consultarUltimaURL(historico);
				break;
			case 4:
				hc.consultarHistoricoCompleto(historico);
				break;
			case 5:
				hc.apagarHistorico(historico);
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Comando inválido!");
			}
		}

	}

}
