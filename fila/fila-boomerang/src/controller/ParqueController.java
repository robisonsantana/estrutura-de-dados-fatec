package controller;

import voltaic.guy.Fila;
import model.Pessoa;
import java.text.DecimalFormat;

public class ParqueController {
	
	public ParqueController() {
		super();
	}
	
	//Confere se a pessoa pode utilizar o brinquedo
	public void brinquedo(Fila pessoas) {
		try {
			//Classe que formata o número decimal
			DecimalFormat df = new DecimalFormat("#.##");
			
			Pessoa pessoa = (Pessoa) pessoas.remove();
			
			//Confere se a pessoa pode utilizar o brinquedo de acordo com as métricas dadas no projeto
			if(pessoa.idade < 16 && pessoa.altura < 160) {
				System.out.println(pessoa.nome + " não pode utulizar o brinquedo, pois -> altura: " + df.format(pessoa.altura) + "cm & idade: " + pessoa.idade);
			} else if(pessoa.altura < 160) {
				System.out.println(pessoa.nome + " não pode utilizar o brinquedo, pois -> altura: " + df.format(pessoa.altura) + "cm");
			} else if(pessoa.idade < 16) {
				System.out.println(pessoa.nome + " não pode utilizar o brinquedo, pois -> idade: " + pessoa.idade);
			} else {
				System.out.println(pessoa.nome + " está liberada para utilizar o brinquedo!");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
