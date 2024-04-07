package view;

import java.util.Scanner;
import voltaic.guy.Fila;

public class Main {

	/* 5. Considerando a biblioteca Fila, já criada, faça:
	 * Criar um projeto Java (ChamadoSim) e importe a biblioteca. Esse novo projeto simulará uma 
	 * necessidade de muitas empresas e ins�tuições que atendem clientes, que é criar um canal de 
	 * geração de senhas para pessoas com alguma prioridade e pessoas que não tem nenhuma prioridade.
	 *  
	 * A classe Principal, no package view, deve ter na Main, a criação de 2 filas, a fila e a 
	 * filaPrioritarios, a inicialização das senhas dos prioritários e dos não prioritários e, por fim, 
	 * deve dar ao usuário a possibilidade de inserir uma nova senha na fila, uma nova senha na fila de 
	 * prioritários ou chamar uma pessoa para o atendimento. Um menu deve ser criado.
	 * 
	 * A classe FilaController deve ter os métodos de validação das operações oferecidas na Main da Classe 
	 * Principal. Todos os métodos devem receber a fila criada no método Main como parâmetro.
	 * 
	 * 		• O método de inserir um novo elemento na fila;
	 * 		• O método de remover o primeiro elemento da fila, que será atendido. A fila não pode estar vazia;
	 * 		• O método de chamado que deve seguir a seguinte regra:
	 * 			- Fazer 3 chamadas prioritárias para 1 da fila não prioritária;
	 * 			- Se não houver prioritários, já se deve chamar dos não prioritários. */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Fila<String> filaComum = new Fila<>();
		Fila<String> filaPreferencial = new Fila<>();
		ChamadoController chamado = new ChamadoController();
		
		int codigo = 0;
		while(codigo != 9) {
			
			System.out.print("MENU SENHAS \n"
						   + "1- Comum \n"
						   + "2- Preferencial \n"
						   + "9- Fechar \n"
						   + "-> ");
			codigo = scanner.nextInt();
			
			switch(codigo) {
			case 1:
				chamado.filaComum(filaComum);
				System.out.println("Senha adcionada! \n");
				break;
			case 2:
				chamado.filaPreferencial(filaPreferencial);
				System.out.println("Senha adcionada! \n");
				break;
			case 9:
				//Fim
				break;
			default: System.out.println("Código inválido! \n");
			}
		}
		
		chamado.chamado(filaComum, filaPreferencial);
	}

}
