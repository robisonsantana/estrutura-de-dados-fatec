package model;

public class Fila<T> {
	
	No<T> inicio;
	No<T> fim;
	
	public Fila() {
		inicio = null;
		fim = null;
	}
	
	public boolean isEmpty() {
		if(inicio == null && fim == null) {
			return true;
		}
		return false;
	}
	
	public void insert(T valor) {
		No<T> elemento = new No<>();
		elemento.dado = valor;
		
		//Verificar se é o primeiro elemento
		if(inicio == null) {
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		} else {
			//Verificar se é o segundo elemento
			if(inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
				fim.proximo = null; 
			} else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}
		}
	}
	
	public T remove() throws Exception {
		if(isEmpty()) {
			throw new Exception("Fila vazia!");
		}
		No<T> aux = inicio;
		if(inicio == fim && inicio != null) { //Se só tem 1 elemento
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.proximo;
		}
		return aux.dado;
	}
	
	public void list() throws Exception {
		if(isEmpty()) {
			throw new Exception("Fila vazia!");
		}
		No<T> aux = inicio;
		while(aux != null) {
			System.out.print(aux.dado + " -> ");
			aux = aux.proximo;
		}
	}
	
	public int size() {
		int count = 0;
		No<T> aux = inicio;
		if(!isEmpty()) {
			while(aux != null) {
				count++;
				aux = aux.proximo;
			}
		}
		return count;
	}

}
