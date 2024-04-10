package model;

public class Documento {
	
	public int idPC;
	public String nomeDocumento;
	
	public Documento(int idPC, String nomeDocumento) {
		this.idPC = idPC;
		this.nomeDocumento = nomeDocumento;
	}

	@Override
	public String toString() {
		return "#PC: " + idPC + " - Arquivo: " + nomeDocumento;
	}
	
}
