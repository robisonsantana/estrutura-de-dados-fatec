package view;
 
import voltaic.guy.Fila;
import model.Cliente;
import controller.OperacaoController;
 
public class Main {
 
	/* 2.Uma determinada loja vende peças no atacado, mas, para comprar no atacado, cada cliente 
	 * pode comprar apenas um tipo de peça.
	 * 
	 * Criar uma aplicação java, baseada na biblioteca Fila Genérica, que faça:
	 * 
	 * 1)Criar um objeto model com os atributos:
	 * 		---------------------------
	 * 				Cliente
	 * 		---------------------------
	 * 			+Nome : String
	 * 			+QuantidadePecas : Int
	 * 			+ValorPecas : Float
	 * 		---------------------------
	 * 
	 * 2) Criar uma classe view (Principal.java) que, na main:
	 * 		a. Inicialize uma nova fila
	 * 		b. Insira 20 clientes com suas características, sendo:
	 * 			i. Nome (Cliente1, Cliente2, Cliente3, ...)
	 * 			ii. Quantidade de peças (Número entre 20 e 50)
	 * 			iii. Valor das Peças (Número entre 5.00 e 100.00)
	 * 
	 * 3) Criar uma classe controller chamada OperacaoController, que tenha um método caixa(Fila:fila):void, 
	 * que receba a fila populada, como parâmetro, e faça, para cada Cliente:
	 * 		a. Calcular o valor total da compra (quantidade * valor)
	 * 		b. Exibir o nome do cliente, o valor total da compra
	 * 
	 * 4)O método main da classe Principal.java deve chamar o método caixa(Fila: fila): void.
	 * 
	 * O método caixa(Fila: fila): void deve estar baseado nas operações da fila (insert(), remove(), list(), 
	 * size(), isEmpty()) */
	public static void main(String[] args) {

		//Fila que recebe o objeto Cliente
		Fila<Cliente> fila = new Fila<>();
		
		//for para preencher a fila com valores simulados
		for(int i = 0; i < 20; i++) {
			String nome = "Cliente" + (i + 1);
			int quantidade = (int)((Math.random() * 31) + 20);
			double valor = (Math.random() * 96) + 5;
			Cliente cliente = new Cliente(nome, quantidade, valor);
			fila.insert(cliente);
		}
		
		//for para chmar o método caixa da classe OperacaoController
		for(int i = 0; i < 20; i++) {
			OperacaoController caixa = new OperacaoController();
			caixa.caixa(fila);
		}

 
	}
 
}
