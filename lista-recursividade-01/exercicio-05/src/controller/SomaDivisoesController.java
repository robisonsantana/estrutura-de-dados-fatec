package controller;

public class SomaDivisoesController {
	
	//Método Construtor:
	public SomaDivisoesController() {
		super();
	}
	
	//Função recursiva para somar as divisões propostas na questão:
	public double somaDivisoes(int numero) {
		//Condição de parada -> Quando o número chegar em 0.
		if(numero == 0) {
			return 0;
		} else {
			return (1 / (double)numero) + somaDivisoes(numero - 1);
			/* O retorno é obtido pela divisão de 1 pelo número, 
			 * seguido pela chamada recursiva da função com o 
			 * número subtraído por 1.*/
		}
	}

}
