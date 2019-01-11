package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteSaida {

	public static void main(String[] args) throws IOException {
		
//		InputStream fis = new FileInputStream("lorem.txt");
		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
//		OutputStream fow = new FileOutputStream("loram-saida.txt");
		OutputStream fow = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(fow);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
//		while( linha != null ) {
		while( linha != null && ! linha.isEmpty() ) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
	}
	
}
