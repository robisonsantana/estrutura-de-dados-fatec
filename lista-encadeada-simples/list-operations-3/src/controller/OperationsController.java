package controller;

import voltaic.guy.lista.*;

public class OperationsController {
	
	public OperationsController() {
		super();
	}
	
	public void maiorMenor(ILista lista) {
		try {
			int maior = 0;
			int menor = (int) lista.get(0);
			
			for(int i = 0; i < lista.size(); i++) {
				int numero = (int)lista.get(i);
				if(numero > maior) {
					maior = numero;
				}else if(numero < menor) {
					menor = numero;
				}
			}
			System.out.println("Maior: " + maior + "\nMenor: " + menor);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
