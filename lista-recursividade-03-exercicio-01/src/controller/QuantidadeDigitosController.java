package controller;

public class QuantidadeDigitosController {
	
	public QuantidadeDigitosController() {
		super();
	}
	
	public int quantidadeDigitos(int numero, int cont, int tester) {
		
		//Condição de retorno -> Quando o "numero" dividido pelo "tester" for menor que 1.
		if(numero / tester < 1) {
			return cont + 1;
		} else {
			return quantidadeDigitos(numero, cont + 1, tester * 10);
			/* O retorno da função é obtido ao chamar recursivamente a mesma função com a 
			 * variável "cont" incrementada em 1 e a variável "tester" multiplicada por 10. */
			
		}
		
	}

}
