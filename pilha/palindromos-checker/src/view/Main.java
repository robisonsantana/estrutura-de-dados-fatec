package view;

import javax.swing.JOptionPane;
import controller.PalindromoController;

public class Main {
	
	/* 3. Considerando a biblioteca PilhaString, já criada, faça:
	 * 
	 * Criar um projeto Java (Palíndromos) e importe a biblioteca PilhaStrings. Esse novo 
	 * projeto irá receber uma cadeia de Strings do usuário e demonstrar para ele se essa 
	 * palavra se trata ou não de um Palíndromo.
	 * 
	 * 				“Palíndromo é uma cadeia de caracteres que se lê da direita para a esquerda 
	 * 				 e da esquerda para a direita e a sequência de caracteres é a mesma, como em 
	 * 				 arara, ovo, subinoonibus, por exemplo.”
	 * 
	 * A classe PalindromoController no package controller deve ter 2 métodos:
	 * 		• O método invertePalavra que recebe um String e retorna o String invertido. Os métodos push(), 
	 * 		  pop(), isEmpty() devem ser usados para esse fim;
	 * 		• O método comparaPalavras, que recebe o String, o String já invertido e retorna um boolean 
	 * 		  (True para Palíndromo e False para Não Palíndromo).
	 * 
	 * A classe Principal, no package view, no seu método Main, deve exibir a possibilidade de o usuário inserir 
	 * uma cadeia de Strings e retornar a ele se é ou não um palíndromo. */
	public static void main(String[] args) {
		
		PalindromoController pc = new PalindromoController();
		
		String palavra = JOptionPane.showInputDialog("É um palíndromo? \n\nDigite uma palavra:");
		
		boolean conferir = pc.comparaPalavras(palavra);
		if(conferir) {
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " é um palíndromo.");
		} else {
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " não é um palíndromo.");
		}
	}

}
