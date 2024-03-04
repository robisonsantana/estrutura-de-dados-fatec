package view;

import javax.swing.JOptionPane;
import controller.QuantidadeController;

public class QuantidadeMain {

	/* 2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 
	 * 10 a 999999 e recebendo um 2o número inteiro (de 0 a 9), tenha uma função recursiva que apresente 
	 * quantas vezes o 2o número aparece no primeiro.
	 * • Exemplo1: 1o. Número = 523578; 2o. Número = 5; retorno aparece 2 vezes.
	 * • Exemplo2: 1o. Número = 836363; 2o. Número = 3; retorno aparece 3 vezes.
	 * • A validação da entrada e do dígito deve ser feito na main da aplicação e não na função recursiva. */
	public static void main(String[] args) {
		
		int cont = 0;
		int controller = 0;
		int numeroA = 0;
		int numeroB = 0;
		
		//While para controlar a entrada dos números:
		while(controller != 9) {
			
			numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 10 e 999999:"));
			if(numeroA < 10 || numeroA > 999999) {
				JOptionPane.showMessageDialog(null, "Número Inválido!\nDigite um número no intervalo definido.");
			} else {
				numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 9:"));
				if(numeroB < 0 || numeroB > 9) {
					JOptionPane.showMessageDialog(null, "Número Inválido!\nDigite um número no intervalo definido.");
				} else {
					controller = 9;
				}
			}

		}
		
		QuantidadeController qc = new QuantidadeController();
		JOptionPane.showMessageDialog(null, "A quantidade do número digitado no primeiro número é de: " 
										   + qc.quantidade(numeroA, numeroB, cont));

	}
	
}
