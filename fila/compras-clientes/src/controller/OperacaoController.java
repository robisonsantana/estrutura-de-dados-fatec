package controller;
 
import voltaic.guy.Fila;
import model.Cliente;
 
public class OperacaoController {
	public OperacaoController() {
		super();
	}
	
	//Método para somar o valor da compra simulada no console
	public void caixa(Fila fila) {
		try {
			Cliente cliente = (Cliente) fila.remove();
			double valorTotal = cliente.valorPeca * cliente.qntPecas;
			
			//%.2f -> para limitar a variável em apenas duas casas decimais
			//%n -> funciona como um println
			System.out.printf(cliente.nome + ": R$ %.2f %n", valorTotal);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
 
}
