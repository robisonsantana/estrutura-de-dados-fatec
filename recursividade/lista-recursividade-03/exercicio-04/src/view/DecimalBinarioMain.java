package view;

import javax.swing.JOptionPane;
import controller.DecimalBinarioController;

public class DecimalBinarioMain {

	/* 4. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo 
	 * um número inteiro, converta para binário. Entrada limitada a 2000. */
	public static void main(String[] args) {
		
		int numeroDecimal = 0;
		int controller = 0;
		
		while(controller != 9) {
			
			numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 2000"));
			
			if(numeroDecimal < 0 || numeroDecimal > 2000) {
				JOptionPane.showMessageDialog(null, "Número Inválido!\nDigite um número no intervalo solicitado.");
			} else {
				controller = 9;
			}
		}
		
		DecimalBinarioController dbc = new DecimalBinarioController();
		JOptionPane.showMessageDialog(null, "O número " + numeroDecimal + " convertido para binário é igual a " 
											+ dbc.conversaoBinario(numeroDecimal));

	}

}
