package view;

import controller.PlayerController;
import javax.swing.JOptionPane;
import model.Musica;
import voltaic.guy.*;

public class Main {

	/* 5. Considerando a biblioteca Lista Genérica criada, fazer uma aplicação Java que simule uma playlist 
	 * de músicas em um aplicativo gratuito. O tal aplicativo Vitufy, por ser gratuito, a partir de uma 
	 * lista, só permite a execução das músicas na ordem em que forem inseridas, não permitindo avançar 
	 * nem retornar. 
	 * 
	 * Criar um objeto Musica (String nome; String nomeArtista; int duracao) 
	 * 
	 * Criar uma classe PlayerController no Package controller, que tenha alguns métodos:
	 * 
	 * 		• adicionaMusica(Lista lista,String musica):void, que receberá uma String no formato: 
	 * 	 	  Nome_da_musica;nome_artista;duracao (obrigatoriamente dessa forma), fazer o split e 
	 *  	  gravar em um objeto Musica e, se a lista estiver vazia, adicione na primeira posição. 
	 *  	  A partir do segundo elemento, todas as outras músicas devem entrar no final da lista;
	 * 		• removeMusica(Lista lista, int posição): void, permitindo que o usuário remova qualquer 
	 *   	  música da lista. Se a lista estiver vazia, uma exceção deve ser mostrada;
	 * 		• executaPlaylist(Lista lista): void, que exibirá, do primeiro ao último elemento, no 
	 *   	  formato [Música: nome da música – Artista: nome artista – Duração: duracao]. Se a lista 
	 *   	  estiver vazia, uma exceção deverá ser lançada.
	 *   
	 *   Bônus: Gerar um sleep para simular a música tocando. Por não ser uma classe tipo Thread, deve-se 
	 *   usar Thread.sleep(tempo); para conseguir o mesmo efeito. 
	 *   
	 *   No Package view, criar uma classe chamada Principal, e, na sua Main, inicialize uma Lista Encadeada 
	 *   e oferecer ao usuário a opção de inserir ou remover músicas na playlist e executar a playlist. No 
	 *   caso da inserção de músicas, deve-se pedir, ao usuário, que digite separadamente cada campo e monte 
	 *   uma String que será mandada ao método adicionaMusica na classe PlayerController. A aplicação deve 
	 *   ficar ativa até que o usuário digite uma opção de sair. */
	public static void main(String[] args) {
		
		PlayerController pc = new PlayerController();
		ILista<Musica> lista = new Lista<>();
		
		int controller = 0;
		while(controller != 9) {
			
			controller = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal \n\n"
																	+ "1- Adicionar música \n"
																	+ "2- Remover música \n"
																	+ "3- Reproduzir playlist \n"
																	+ "9- Sair"));
			switch(controller) {
			case 1:
				String musica = JOptionPane.showInputDialog("Digite o nome da música no formato 'Nome_da_musica;nome_artista;duracao':");
				pc.adicionarMusica(lista, musica);
				break;
			case 2:
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da música:"));
				pc.removerMusica(lista, posicao);
				break;
			case 3:
				pc.executarPlaylist(lista);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Programa finalizado!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Número inválido!");
				break;
			}
		}
	}

}
