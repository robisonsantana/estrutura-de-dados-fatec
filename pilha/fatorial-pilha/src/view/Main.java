package view;

import java.util.Scanner;
import controller.FatController;


public class Main {

	//Fatorial utilizando pilha
	public static void main(String[] args) {
		FatController fat = new FatController();
		Scanner scanner = new Scanner(System.in);
		int numero = 11;
		
		while(numero < 0 || numero > 10) {
			System.out.print("Digite um número de 0 a 10: \n-> ");
			numero = scanner.nextInt();
			
			if(numero > 10 || numero < 0) {
				System.out.println("\nNúmero inv�lido!");
			}
		}
		
		System.out.println("Fatorial de " + numero + " = " + fat.fatorial(numero));

	}

}
