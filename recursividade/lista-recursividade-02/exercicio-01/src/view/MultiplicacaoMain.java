package view;

import javax.swing.JOptionPane;
import controller.MultiplicacaoController;

public class MultiplicacaoMain {

	/* 1. Criar uma função recursiva que receba 2 valores A e B e, 
	 * por somas, apresente o resultado da multiplicação de A por B. */
	public static void main(String[] args) {

		int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
		
		MultiplicacaoController mc = new MultiplicacaoController();
		JOptionPane.showMessageDialog(null, "A multiplicaçã de " + numeroA + " por " + numeroB 
										  + " é igual a " + mc.multiplicacao(numeroA, numeroB));

	}

}
