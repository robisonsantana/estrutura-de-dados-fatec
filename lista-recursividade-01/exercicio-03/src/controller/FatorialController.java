package controller;

public class FatorialController {
	
	//Método Construtor:
	public FatorialController() {
		super();
	}
	
	//Função recursiva para calcular o fatorial de um número:
	public int fatorialRecursiva(int numero) {
		
		//Condição de parada -> Quando o número for igual a 1.
		if(numero == 1) {
			return 1;
		} else {
			return numero * fatorialRecursiva(numero - 1);
			//O retorno é calculado multiplicando o número pela função
			//recursiva, onde o número é subtraído por 1 antes de ser 
			//passado para a função novamente.
			
		}
		
	}

}
