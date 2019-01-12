package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteEscritaProperties {

	public static void main(String[] args) throws IOException {
		
		Properties props = new Properties();
		
		String fileName = "props.txt";
		
		props.setProperty("user", "jonas");
		props.setProperty("passw", "jonaspass");
		props.setProperty("host", "www.jonaspass.com.br");
		
		props.store(new FileWriter(fileName), "Comentario props");
		
		System.out.println("Arquivo " + fileName + " criado com sucesso!");
		
	}
	
}
