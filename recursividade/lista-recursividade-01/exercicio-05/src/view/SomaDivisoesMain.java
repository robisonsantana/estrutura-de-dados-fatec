package view;

import controller.SomaDivisoesController;

public class SomaDivisoesMain {
	
	/* 5. Criar uma aplicação em Java que tenha uma função recursiva que,
	 * recebendo um número inteiro (N), apresente a saída da somatória
	 * SS = 1 + 1 + 1 + 1 + ... 1
	 *      1   2   3   4       N */
	public static void main(String[] args) {
		
		int numero = 5;
		
		SomaDivisoesController sdc = new SomaDivisoesController();
		double resultado = sdc.somaDivisoes(numero);
		System.out.println(resultado);
		
	}

}
