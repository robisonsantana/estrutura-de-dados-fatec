package view;

import java.util.Scanner;
import controller.ConverteController;

public class Main {

	/* 4. Implementar um novo projeto Java com base biblioteca PilhaInt que permita 
	 * a conversão de decimais para binários, a qual se dá dividindo, sucessivamente, 
	 * o valor de entrada por 2 e concatenando os restos da divisão do último para o 
	 * primeiro. O projeto deve ter uma classe ConverteController no package controller, 
	 * que inicialize uma pilha de inteiros e com um método decToBin(int decimal): String, 
	 * que, recebendo um número decimal e realizando as operações, irá inserindo os restos 
	 * das divisões na pilha. Ao término do empilhamento, deverá ser feita a operação de 
	 * desempilhar, concatenando cada número desempilhado (Convertendo para String) com o 
	 * próximo, até a pilha esvaziar. Deve-se ter também uma classe Principal no package 
	 * view que permita ao usuário inserir um número decimal limitado a 1000. */
	public static void main(String[] args) throws Exception {
		
		ConverteController converter = new ConverteController();
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		boolean controller = true;
		while(controller) {
			System.out.print("Digite um numero de até 1000: \n->  ");
			numero = scanner.nextInt();
			
			if(numero > 1000) {
				System.out.println("Numero invalido!");
			} else {
				controller = false;
			}
		}
		
		System.out.println("O número " + numero + " convertido para binário é igual a " + converter.decToBin(numero));

	}

}
