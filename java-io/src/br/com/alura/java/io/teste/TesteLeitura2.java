package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
//		String linha = scanner.nextLine();
//		System.out.println(linha);
//		System.out.println("--------");
		
		while( scanner.hasNextLine() ) {
			System.out.println( scanner.nextLine() );
		}
		
		
		scanner.close();
		
	}
	
}
