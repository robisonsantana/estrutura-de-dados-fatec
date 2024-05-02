package controller;

import model.Musica;
import voltaic.guy.*;
import javax.swing.JOptionPane;

public class PlayerController {
	
	public PlayerController() {
		super();
	}
	
	public void adicionarMusica(ILista lista, String musica) {
		String[] partes = musica.split(";");
		if (partes.length != 3) {
	        JOptionPane.showMessageDialog(null, "Formato de música inválido.");
	        return;
	    }
		String[] nomePartes = partes[0].split("_");
		String[] artistaPartes = partes[1].split("_");
		String[] duracaoPartes = partes[2].split("_");
		String nome = "";
		for(String i : nomePartes) {
			nome += i + " ";
		}
		String artista = "";
		for(String i : artistaPartes) {
			artista += i + " ";
		}
		String duracao = "";
		for(String i : duracaoPartes) {
			duracao += i + "";
		}
		
		Musica add = new Musica(nome, artista, duracao);
		if(lista.isEmpty()) {
			lista.addFirst(add);
		} else {
			try {
				lista.addLast(add);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public void removerMusica(ILista lista, int posicao) {
		try {
			lista.remove(posicao);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void executarPlaylist(ILista lista) {
		int i = 0;
		for(i = 0; i < lista.size(); i++) {
			try {
				System.out.println(lista.get(i));
				Musica consulta = (Musica)lista.get(i);
				Thread.sleep(calcularTempo(consulta.duracao));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		if(i == 0) {
			System.err.println("Playlist vazia!");
		}
	}
	
	private int calcularTempo(String tempo) {
		String[] partes = tempo.split(":");
		int minutos = Integer.parseInt(partes[0]) * 60;
		int segundos = Integer.parseInt(partes[1]);
		int duracao = (minutos + segundos) * 1000;
		return duracao;
	}
}
