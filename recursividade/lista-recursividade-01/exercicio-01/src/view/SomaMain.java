package view;

import controller.SomaController;

public class SomaMain {
	
	//1. Criar uma aplicação em Java que tenha uma função recursiva que calcule 
	//o somatório do N primeiros número NATURAIS (a função deve retornar zero para 
	//números negativos)
	public static void main(String[] args) {
		
		int numero = 5;
		
		SomaController  sc = new SomaController();
		int somaNumeros = sc.somaNumeros(numero);
		System.out.println(somaNumeros);
		
	}

}
