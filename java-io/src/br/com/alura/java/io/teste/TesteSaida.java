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
import java.net.Socket;

public class TesteSaida {

	public static void main(String[] args) throws IOException {
		
//		Socket socket = new Socket();
//		InputStream fis = new FileInputStream("lorem.txt");
		InputStream fis = System.in;
//		InputStream fis = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
//		OutputStream fos = new FileOutputStream("loram-saida.txt");
		OutputStream fos = System.out;
//		OutputStream fos = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(fos);
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
