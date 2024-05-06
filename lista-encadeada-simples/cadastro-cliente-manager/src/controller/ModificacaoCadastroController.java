package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import voltaic.guy.lista.*;

public class ModificacaoCadastroController {
	
	private String path = "C:\\TEMP";
	
	public ModificacaoCadastroController() {
		super();
	}
	
	 private void novoArquivo(ILista<String> listaClientes, String nomeArquivo) throws IOException {
	        File arq = new File(path, nomeArquivo);
	        StringBuilder buffer = new StringBuilder();
	        for (int i = 0; i < listaClientes.size(); i++) {
	            try {
					buffer.append(listaClientes.get(i)).append("\r\n");
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
	        }
	        FileWriter fileWriter = new FileWriter(arq);
	        fileWriter.write(buffer.toString());
	        fileWriter.close();
	    }
	 
	 public void novoCadastro(int idadeMin, int idadeMax, Double limiteCredito) throws IOException {
	        ILista<String> listaClientes = new Lista<>();
	        FileReader fileReader = new FileReader(path + "\\cadastro.csv");
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        String linha = bufferedReader.readLine(); // Skip header line
	        linha = bufferedReader.readLine(); // Start from the first data line
	        while (linha != null) {
	            String[] dados = linha.split(", ");
	            int idade = Integer.parseInt(dados[2]);
	            double limite = Double.parseDouble(dados[3].replace(",", "."));
	            if (idade >= idadeMin && idade <= idadeMax && limite > limiteCredito) {
	                listaClientes.addFirst(linha);
	            }
	            linha = bufferedReader.readLine();
	        }
	        bufferedReader.close();
	        fileReader.close();
	        
	        String nomeArquivo = "Idade " + idadeMin + "-" + idadeMax + " limite" + limiteCredito + ".csv";
	        novoArquivo(listaClientes, nomeArquivo);
	    }

}
