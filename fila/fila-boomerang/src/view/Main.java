package view;

import controller.ParqueController;
import voltaic.guy.Fila;
import model.Pessoa;

public class Main {

	/* 5. No parque de diversões, forma-se uma fila de crianças para ir ao brinquedo denominado Boomerang. 
	 * Para entrar no brinquedo, a criança deve ter mais de 1.60m e mais de 16 anos. Criar uma aplicação Java, 
	 * baseada na biblioteca Fila Genérica, que faça:
	 * 
	 * 1) Criar um objeto model com os atributos:
	 * 
	 * 		--------------------
	 * 			  Pessoa
	 * 		--------------------
	 * 		  +Nome : String
	 * 		  +Idade : Int
	 * 		  +Altura : float
	 * 		--------------------
	 * 
	 * 2) Criar uma classe view (Principal.java) que, na main:
	 * 		a. Inicialize uma nova fila
	 * 		b. Insira 30 clientes com suas características, sendo:
	 * 			i. Nome (Pessoa1, Pessoa2, Pessoa3, ...)
	 * 			ii. Idade (Número entre 10 e 40)
	 * 			iii. Altura (Número entre 1.35 e 2.00)
	 * 
	 * 3) Criar uma classe controller chamada ParqueController, que tenha um método brinquedo(Fila fila): void, 
	 * que receba a fila populada, como parâmetro, e faça, para cada Cliente:
	 * 		a. Verificar se a pessoa está em condições de ir ao brinquedo
	 * 		b. Exibir o nome do cliente, se passou para dentro do brinquedo ou não e a razão
	 * 
	 * 4) O método main da classe Principal.java deve chamar o método brinquedo(Fila fila): void.
	 * 
	 * O método brinquedo(Fila fila): void deve estar baseado nas operações da fila (insert(), remove(), list(), 
	 * size(), isEmpty()) */
	public static void main(String[] args) {
		
		//Cria fila do tipo Pessoa
		Fila<Pessoa> pessoas = new Fila<>();
		ParqueController parque = new ParqueController();
		
		//Preenche fila com informações simuladas
		for(int i = 0; i < 30; i++) {
			String nome = "Pessoa" + (i + 1);
			int idade = (int)((Math.random() * 96) + 5);
			double altura = (Math.random() * 95) + 105;
			Pessoa pessoa = new Pessoa(nome, idade, altura);
			pessoas.insert(pessoa);
		}
		
		//Chama o método brinquedo enquanto a fila não estiver vazia
		while(!pessoas.isEmpty()) {
			parque.brinquedo(pessoas);
		}

	}

}
