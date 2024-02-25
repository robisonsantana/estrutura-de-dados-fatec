package view;

import controller.FatorialController;

public class FatorialMain {
	
	/*  3. Crie uma função recursiva que exiba o resultado do fatorial
	 *  de um número (Pela limitação da recursividade, o número de entrada
	 *  deverá ser baixo para não dar estouro(limite de entrada = 12)): */
	public static void main(String[] args) {
		
		int numero = 5;
		
		FatorialController fc = new FatorialController();
		int fatorial = fc.fatorialRecursiva(numero);
		System.out.println(fatorial);
		
	}

}
