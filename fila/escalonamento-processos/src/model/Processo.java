package model;

public class Processo {
	
	public String nome;
	public int qtdRetornos;
	
	public Processo(String nome, int qtdRetornos) {
		this.nome = nome;
		this.qtdRetornos = qtdRetornos;
	}

	@Override
	public String toString() {
		return  nome + ";" + qtdRetornos;
	}
	
}
