package view;

import javax.swing.JOptionPane;
import controller.RestoDivisaoController;

public class RestoDivisaoMain {

	/* 2. Criar uma função recursiva que receba o dividendo e 
	 * o divisor de uma operação de divisão e, por subtrações, 
	 * exiba o resto da divisão. */
	public static void main(String[] args) {
		
		int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo:"));
		int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor:"));
		
		RestoDivisaoController rdc = new RestoDivisaoController();
		JOptionPane.showMessageDialog(null, "O resto da divisão de " + dividendo + " por " + divisor + " é " + rdc.resto(dividendo, divisor));

	}

}
