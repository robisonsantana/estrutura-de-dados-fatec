package view;

import voltaic.guy.Fila;

public class ChamadoController {
	
	private static int countComum = 0;
	private static int countPreferencial = 0;
	
	public ChamadoController() {
		super();
	}
	
	//Cria uma noca senha do tipo comum e adiciona a fila
	public void filaComum(Fila<String> filaComum) {
		countComum++;
		filaComum.insert("COM" + countComum);
	}
	
	//Cria uma nova senha do tipo preferencial e adiciona a fila
	public void filaPreferencial(Fila<String> filaComum) {
		countPreferencial++;
		filaComum.insert("PREF" + countPreferencial);
	}
	
	//Organiza a ordem de chamadas da fila
	public void chamado(Fila<String> filaComum, Fila<String> filaPreferencial) {
		
		System.out.println("\nSequência de chamadas:");
		
		//Enquando as filas não estiverem vazias:
		while(!filaPreferencial.isEmpty() || !filaComum.isEmpty()) {
			if(!filaPreferencial.isEmpty()) { //Se a fila preferencial não estiver vazia
				if(filaPreferencial.size() >= 3) { //Se a fila preferencial for maior igual a 3
					for(int i = 0; i < 3; i++) { //Se sim, remove e mostra os três primeiros elementos da fila preferencial
						try {
							Object senha = filaPreferencial.remove();
							System.out.println("Senha: " + senha);
						} catch (Exception e) {
							System.err.println(e.getMessage());
						}
					}
				} else { //Se não, remove e mostra os elementos restantes na fila preferencial
					int tamanho = filaPreferencial.size();
					for(int i = 0; i < tamanho; i++) {
						Object senha;
						try {
							senha = filaPreferencial.remove();
							System.out.println("Senha: " + senha);
						} catch (Exception e) {
							System.err.println(e.getMessage());
						}
					}
				}
			}
			if(!filaComum.isEmpty()) { //Se a fila comum não estiver vazia remove e mostra seu primeiro elemento
				try {
					Object senha = filaComum.remove();
					System.out.println("Senha: " + senha);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}

}
