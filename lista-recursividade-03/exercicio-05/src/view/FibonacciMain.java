package view;

import javax.swing.JOptionPane;
import controller.FibonacciController;

public class FibonacciMain {

	/* 5. Considere a série de Fibonacci:
	 * 
	 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
	 * 
	 * Escrever uma função recursiva que, dado uma posição da série, a função retorne seu valor.
	 * Entrada limitada a 20 (Condição que deve ser testada na Main da aplicação). */
	public static void main(String[] args) {
		
		int posicao = 0;
		int controller = 0;
		
		while(controller != 9) {
			
			posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posição da série de Fibonacci:"));
			
			if(posicao < 1 || posicao > 20) {
				JOptionPane.showMessageDialog(null, "Número Inválido!\nDigite um número no intervalo solicitado.");
			} else {
				controller = 9;
			}
		}
		
		FibonacciController fc = new FibonacciController();
		JOptionPane.showMessageDialog(null, "O número da " + posicao + "º posição da série de Fibonacci é " 
											+ fc.fibonacci(posicao));

	}

}
