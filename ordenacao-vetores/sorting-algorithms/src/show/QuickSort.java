package show;

public class QuickSort {

	public QuickSort() {
		super();
	}
	
	public int[] quickSort(int[] vetor, int inicio, int fim) {
		if(inicio < fim) {
			int pivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, pivoFixo - 1); 
			quickSort(vetor, pivoFixo + 1, fim);
		}
		return vetor;
	}
 
	private int dividir(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		/* Enquanto o ponteiro da esquerda se mantiver à esquerda do ponteiro da direita, validar: */
		while(ponteiroEsquerda <= ponteiroDireita) {
			/* Enquanto o ponteiro da esquerda continuar à esquerda (menor ou igual) do ponteiro da 
			 * direita e o valor do ponteiro da esquerda for menor ou igual ao valor do pivô, o 
			 * ponteiro da esquerda incrementa 1. Se alguma condição falhar, o incremento cessa. */
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			/* Enquanto o ponteiro da direita continuar à direita (maior ou igual) do ponteiro da esquerda 
			 * e o valor do ponteiro da direita for maior que o pivô e, o ponteiro da direita decrementa 1. 
			 * Se alguma condição falhar, o decremento cessa. */
			while(ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			/* Se incremento do ponteiro da esquerda e decremento do ponteiro da direita cessarem, mas o ponteiro 
			 * da esquerda continuar à esquerda (menor) do ponteiro da direita, os valores cujos índices forem, 
			 * ponteiro da esquerda e ponteiro da direita, mudam de lugar. Incrementa-se o ponteiro da esquerda 
			 * e decrementase o ponteiro da direita */
			if(ponteiroEsquerda < ponteiroDireita) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		trocar(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;
	}
 
	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
}
