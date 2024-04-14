package controller;

public class MDCController {
	
	public MDCController() {
		super();
	}
	
	public int MDCCalculo(int numeroX, int numeroY) {
		
		/*  A condição de parada ocorre quando os números são iguais, ou seja, 
		 * "numeroX == numeroY". Nesse caso, a função retorna qualquer um dos 
		 * números, pois o máximo divisor comum de dois números iguais é o 
		 * próprio número. */
		if(numeroX == numeroY) {
			return numeroX;
		} else if(numeroX > numeroY) {
			return MDCCalculo(numeroX - numeroY, numeroY);
		} else {
			return MDCCalculo(numeroY, numeroX);
		}
		/*  - Se "numeroX" for maior que "numeroY", a função chama a si mesma 
		 * com os parâmetros "(numeroX - numeroY, numeroY)". Isso reduz o problema, 
		 * garantindo que "numeroX" seja reduzido até que se torne igual a "numeroY", 
		 * ou até que o caso base seja alcançado. 
		 * 
		 * - Se "numeroY" for maior que "numeroX", a função chama a si mesma com os 
		 * parâmetros "(numeroY, numeroX)". Isso garante que "numeroY" seja reduzido 
		 * até que se torne igual a "numeroX", ou até que o caso base seja alcançado. */
	}

}
