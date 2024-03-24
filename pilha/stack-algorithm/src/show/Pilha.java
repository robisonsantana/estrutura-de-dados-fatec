package show;

public class Pilha {
	
	No topo;

	public Pilha() {
		topo = null;
	}
	
	//Verifica se a pilha está vazia. Retorna true se a pilha estiver vazia e false caso contrário.
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	// Insere um novo elemento na pilha. O novo elemento é inserido no topo da pilha.
	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		if(isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	/* Remove o elemento do topo da pilha e retorna o valor do elemento. Se a pilha estiver vazia, 
	 * uma exceção é lançada. */
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Não há elementos para desempilhar.");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	/* Retorna o valor do elemento no topo da pilha sem removê-lo. Se a pilha estiver vazia, 
	 * uma exceção é lançada. */
	public int top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Não há elementos na pilha.");
		}
		return topo.dado;
	}
	
	//Retorna o número de elementos na pilha.
	public int size() {
		int count = 0;
		if(!isEmpty()) {
			No aux = topo;
			count = 1;
			while(aux.proximo != null) {
				aux = aux.proximo;
				count++;
			}
		}
		return count;
	}
}
