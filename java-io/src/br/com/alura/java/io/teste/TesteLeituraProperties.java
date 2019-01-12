package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TesteLeituraProperties {

	public static void main(String[] args) throws IOException {
		
		String fileName = "props.txt";
		
		Properties props = new Properties();
		props.load(new FileReader(fileName));
		
		String user = props.getProperty("user");
		String pass = props.getProperty("passw");
		String host = props.getProperty("host");
		
		System.out.println("Aruivo " + fileName + " lido com sucesso!");
		System.out.println("User: " + user);
		System.out.println("Pass: " + pass);
		System.out.println("Host: " + host);
		
		
	}
	
}
