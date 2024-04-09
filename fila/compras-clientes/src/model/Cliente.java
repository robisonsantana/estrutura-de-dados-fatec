package model;
 
public class Cliente {
	public String nome;
	public int qntPecas;
	public double valorPeca;
	
	
	public Cliente(String nome, int qntPecas, double valorPeca) {
		this.nome = nome;
		this.qntPecas = qntPecas;
		this.valorPeca = valorPeca;
	}
 
	@Override
	public String toString() {
		return "Nome: " + nome + " Quant. Peças: " + qntPecas + " Valor: " + valorPeca;
	}

 
}
