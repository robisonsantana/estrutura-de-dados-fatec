package view;

import javax.swing.JOptionPane;
import controller.QuantidadeDigitosController;

public class QuantidadeDigitosMain {

	/* 1. Crie uma função recursiva que exiba a quantidade 
	 * de dígitos de um número inteiro */
	public static void main(String[] args) {
		
		int cont = 0;
		int tester = 10;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		QuantidadeDigitosController qdc = new QuantidadeDigitosController();
		JOptionPane.showMessageDialog(null, "A quantidade de dígitos no número inteiro é " 
										   + qdc.quantidadeDigitos(numero, cont, tester));
		
	}

}
