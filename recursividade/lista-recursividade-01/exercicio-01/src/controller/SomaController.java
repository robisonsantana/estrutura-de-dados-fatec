package controller;

public class SomaController {
	
	//Método Construtor:
	public SomaController() {
		super();
	}
	
	//Função recursiva para somar os primeiros números naturais:
	public int somaNumeros(int numero) {
		//Condição de parada -> Quando a variável "numero" chegar a 0.
		if(numero == 0) {
			return 0;
		} else {
			return numero + somaNumeros(numero - 1);
			//O retorno é calculado somando o valor da variável "numero"
			//com a chamada recursiva da função, onde o valor da variável
			//"numero" é subtraído por 1.
		}
		
	}

}
