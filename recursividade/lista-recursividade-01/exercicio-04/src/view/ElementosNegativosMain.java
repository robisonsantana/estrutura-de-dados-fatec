package view;

import controller.ElementosNegativosController;

public class ElementosNegativosMain {
	
	//4. Crie uma função recursiva que exiba o total de elementos negativos de um
	//vetor de inteiros, de N posições.
	public static void main(String[] args) {
		
		int vetor[] = {4, 9, -3, 3, -8, -1, -5, 2, 6, -7, -6};
		int tamanho = vetor.length;
		
		ElementosNegativosController enc = new ElementosNegativosController();
		int quantidadeNegativos = enc.elementosNegativos(vetor, tamanho, tamanho);
		System.out.println(quantidadeNegativos);
		
	}

}
