package controller;

public class QuantidadeController {
	
	public QuantidadeController() {
		super();
	}
	
	public int quantidade(int numeroA, int numeroB, int cont) {
		
		//Condição de parada -> Quando o numeroA for menor ou igual a zero.
		if(numeroA <= 0) {
			return cont;
		} else {
			if(numeroB == numeroA % 10) {
				return quantidade(numeroA / 10, numeroB, cont + 1);
			} else {
				return quantidade(numeroA / 10, numeroB, cont);
				/* O retorno da função ocorre mediante uma chamada recursiva, na qual 
				 * verificamos se o resto da divisão de "numeroA" por 10, armazenado na 
				 * variável "numero", é igual a "numeroB". Se essa condição for verdadeira, 
				 * incrementamos a variável "cont" em 1 e dividimos "numeroA" por 10. Caso 
				 * contrário, a função é chamada recursivamente com "numeroA" dividido por 10. 
				 * Esse processo continua até que não seja mais possível dividir "numeroA" por 10. */
				
			}
			
		}
		
	}

}
