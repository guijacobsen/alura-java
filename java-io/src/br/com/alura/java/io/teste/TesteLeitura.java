package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo
//		FileInputStream fis = new FileInputStream("lorem.txt");
//		InputStreamReader isr = new InputStreamReader(fis);
		
		InputStream fis = new FileInputStream("lorem.txt");
//		Reader isr = new InputStreamReader(fis);		
//		Reader isr = new InputStreamReader(fis, "UTF-8");
		Reader isr = new InputStreamReader(fis, StandardCharsets.UTF_8.name());
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while( linha != null ) {
			System.out.println( linha );
			linha = br.readLine();
		}	
		
		
		br.close();
		
		
	}

}
