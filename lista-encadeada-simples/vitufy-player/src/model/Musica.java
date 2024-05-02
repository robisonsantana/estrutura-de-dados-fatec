package model;

public class Musica {
	
	public String nome;
	public String nomeArtista;
	public String duracao;
	
	public Musica(String nome, String nomeArtista, String duracao) {
		this.nome = nome;
		this.nomeArtista = nomeArtista;
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Artista: " + nomeArtista + " Duração: " + duracao;
	}
	
	

}
