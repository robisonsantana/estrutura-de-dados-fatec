package show;

public class MergeSort {
	
	public MergeSort() {
		super();
	}
	
	public int[] mergeSort(int[] vetor, int inicio, int fim) {
		
		if(inicio < fim) {	
			int meio = (inicio + fim) / 2;
			mergeSort(vetor, inicio, meio); //Esquerda do vetor
			mergeSort(vetor, meio + 1, fim); //Direita do vetor
			intercala(vetor, inicio, meio, fim);
		}
		return vetor;
	}

	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		
		int[] vetorAuxiliar = new int[vetor.length];
		
		for(int i = inicio; i <= fim; i++) {
			vetorAuxiliar[i] = vetor[i];
		}
		
		int esquerda = inicio;
		int direita = meio + 1;
		
		for(int i = inicio; i <= fim; i++) {
			
			/* Se o ponteiro da esquerda é maior que a posição do meio, o vetor 
			 * inicial na posição do contador, recebe o valor do novo vetor na 
			 * posição do ponteiro à direita. Incrementa-se o ponteiro da direita. */
			if(esquerda > meio) {
				vetor[i] = vetorAuxiliar[direita];
				direita++;
				
			/* Senão, se o ponteiro da direta é maior que a posição do fim, o vetor 
			 * inicial na posição do contador, recebe o valor do novo vetor na posição 
			 * do ponteiro à esquerda. Incrementa-se o ponteiro da esquerda. */
			} else if(direita > fim) {
				vetor[i] = vetorAuxiliar[esquerda];
				esquerda++;
				
			/* Senão, se o valor do novo vetor na posição do ponteiro à esquerda é menor 
			 * que o valor do novo vetor na posição do ponteiro à direita, o vetor inicial 
			 * na posição do contador, recebe o valor do novo vetor na posição do ponteiro 
			 * à esquerda. Incrementa-se o ponteiro da esquerda. */
			} else if(vetorAuxiliar[esquerda] < vetorAuxiliar[direita]) {
				vetor[i] = vetorAuxiliar[esquerda];
				esquerda++;
				
			/* Senão, o vetor inicial na posição do contador, recebe o valor do novo vetor na 
			 * posição do ponteiro à direita. Incrementa-se o ponteiro da direita. */
			} else {
				vetor[i] = vetorAuxiliar[direita];
				direita++;
			}
		}	
	}

}
