package view;

import javax.swing.JOptionPane;
import controller.InversaoController;

public class InversaoMain {

	/* 3. Crie uma função recursiva que exiba o resultado da inversão de 
	 * uma cadeia de caracteres (Ex.: entrada = teste ; saída = etset): 
	 * Deve se utilizar a função SUBSTRING da Java */
	public static void main(String[] args) {
		
		String originalString = JOptionPane.showInputDialog("Digite uma paravra para ser invertida:");
		
		InversaoController ic = new InversaoController();
		JOptionPane.showMessageDialog(null, "A palavra escrita ao contrário fica: " + ic.inversao(originalString));
		
	}

}
