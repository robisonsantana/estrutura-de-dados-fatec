package controller;

import model.Documento;
import voltaic.guy.Fila;

public class ImpressoraController {

	public ImpressoraController() {
		super();
	}
	
	//Método para inserir documentos a fila
	public void insereDocumento(Fila documentos, String entrada) {
			String[] partes = entrada.split(";");
			int id = Integer.parseInt(partes[0]);
			String nome = partes[1];
			Documento documento = new Documento(id, nome);
			documentos.insert(documento);
	}
	
	//Métodos para imprimir os documentos da fila
	public void imprime(Fila documentos) {
		while(!documentos.isEmpty()) {
			try {
				Object arquivo = documentos.remove();
				System.out.println("Imprimindo documento: " + arquivo);
				int tempo = (int)((Math.random() * 1001) + 1000);
				Thread.sleep(tempo);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
