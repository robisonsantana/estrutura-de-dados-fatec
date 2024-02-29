package view;

import javax.swing.JOptionPane;
import controller.FatorialDuploController;

public class FatorialDuploMain {

	/* 4. Faça uma função recursiva que receba um número inteiro positivo
	 * ímpar N e retorne o fatorial duplo desse número (A entrada deve ser 
	 * validada fora da função recursiva). O fatorial duplo é definido como 
	 * o produto de todos os números naturais ímpares de 1 até algum número 
	 * natural ímpar N. Assim, o fatorial duplo de 5 é: 
	 * 
	 * 5!! = 5 * 3 * 1 = 15
	 * */
	public static void main(String[] args) {
		
		/* O loop 'while' continuará pedindo à pessoa para digitar um número 
		 * até que ela insira um número ímpar. */
		int numero = 0;
		int controller = 0;
		while(controller != 9) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ímpar:"));
			if(numero % 2 == 0) {
				JOptionPane.showMessageDialog(null, "Número Inválido!\nDigite um número ímpar.");
			} else {
				controller = 9;
			}
		}
		
		FatorialDuploController fdc = new FatorialDuploController();
		JOptionPane.showMessageDialog(null, "O fatorial duplo de " + numero + " é " + fdc.fatorialDuplo(numero));

	}

}
