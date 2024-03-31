package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import voltaic.guy.pilhastrings.Pilha;

public class HistoricoController {
	
	public HistoricoController() {
		super();
	}
	
	//Método para validar e adicionar novas URLs
	public void addURL(Pilha historico) {
		
		String url = JOptionPane.showInputDialog("Digite o novo endereço:"); 
		
		//A classe Pattern compila a expressão regular para validar a URL
		Pattern expressaoRegular = Pattern.compile("^(http|https):\\/\\/(www\\.)?([a-zA-Z0-9]+)([.-](?!-)[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,6}$");
		
		//A classe Matcher verifica se a URL bate com a expressão regular
		Matcher matcher = expressaoRegular.matcher(url);
		
		//Caso a URL bata com a expressão regular, ela é adicionada ao histórico
		if(matcher.matches()) {
			historico.push(url);
			JOptionPane.showMessageDialog(null, "URL adicionada!");
			
		//Caso contrário, é disparada uma mensagem de URL inválida
		} else {
			JOptionPane.showMessageDialog(null, "URL inválida!");
		}
	}
	
	//Método para remover a última URL
	public void removerURL(Pilha historico) {
		try {
			historico.pop();
			JOptionPane.showMessageDialog(null, "Última URL excluída!");
		} catch (Exception e) {
			System.err.println("Histórico vazio.");
		}
	}
	
	//Método para consultar a última URL
	public void consultarUltimaURL(Pilha historico) {
		try {
			String item = historico.pop();
			JOptionPane.showMessageDialog(null, item);
			historico.push(item);
		} catch (Exception e) {
			System.err.println("Histórico vazio.");
		}
	}
	
	//Método para consultar o histórico completo
	public void consultarHistoricoCompleto(Pilha historico) {
		Pilha historicoAux = new Pilha();
		String item = "";
		if(historico.isEmpty()) {
			System.err.println("Histórico vazio.");
		} else {
			while(!historico.isEmpty()) {
				try {
					item = historico.pop();
					historicoAux.push(item);
					System.out.println(item);
				} catch (Exception e) {
					System.err.println("Histórico vazio.");
				}
			}
			
			while(!historicoAux.isEmpty()) {
				try {
					item = historicoAux.pop();
					historico.push(item);
				} catch (Exception e) {
					System.err.println("Histórico vazio.");
				}
			}
		}
	}
	
	//Método para apagar todo histórico
	public void apagarHistorico(Pilha historico) {
		
		if(historico.isEmpty()) {
			System.err.println("Histórico vazio.");
		} else {
			while(!historico.isEmpty()) {
				try {
					historico.pop();
				} catch (Exception e) {
					System.err.println("Histórico vazio.");
				}
			}
			JOptionPane.showMessageDialog(null, "Histórico apagado!");
		}
		
	}

}
