package controller;

public class DecimalBinarioController {
	
	public DecimalBinarioController() {
		super();
	}
	
	public String conversaoBinario(int numeroDecimal) {
		
		//Condição de Parada -> Quando o numeroDecimal for igual a 0 ou a 1.
		if(numeroDecimal == 0 || numeroDecimal == 1) {
			return Integer.toString(numeroDecimal);
		} else {
			return conversaoBinario(numeroDecimal / 2) + Integer.toString(numeroDecimal % 2);
			/* Caso contrário, a função realiza uma chamada recursiva, onde o parâmetro
			 * é definido como o resultado da divisão inteira de "numeroDecimal" por 2
			 * adicionado a uma string que concatena o resto da divisão de "numeroDecimal"
			 * por dois. Esse processo continua até que não seja mais possível dividir 
			 * "numeroDecimal" por 2. */
		}
		
	}

}
