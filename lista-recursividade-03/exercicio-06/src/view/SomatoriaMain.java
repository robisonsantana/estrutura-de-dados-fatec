package view;

import javax.swing.JOptionPane;
import controller.SomatoriaController;

public class SomatoriaMain {

	/* 6. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número 
	 * inteiro (N), apresente a saída da somatória:
	 * 
	 * S = 1 + 1 + 1 ... 1
	 *         2!  3!    N! */
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		SomatoriaController sc = new SomatoriaController();
		JOptionPane.showMessageDialog(null, "A somatória da sequência é " + sc.somatoria(numero));

	}

}
