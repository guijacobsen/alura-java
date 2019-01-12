package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
//		String linha = scanner.nextLine();
//		System.out.println(linha);
//		System.out.println("--------");
		
		while( scanner.hasNextLine() ) {
			String linha = scanner.nextLine();
			System.out.println( linha );
			
//			String[] valores = linha.split(",");
//			System.out.println(valores);
//			System.out.println( Arrays.toString(valores) );			
//			for( String s : valores ) {
//				System.out.println("s : " + s);
//			}
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
//			Scanner linhaScanner = new Scanner(linha);
//			linhaScanner.useLocale(Locale.US);
//			String[] valores = linha.split(",");
//			
//			String valor1 = valores[0];
//			int valor2 = Integer.valueOf(valores[1]);
//			int valor3 = Integer.valueOf(valores[2]);
//			String valor4 = valores[3];
//			double valor5 = Double.valueOf(valores[4]);
//			
//			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			
			linhaScanner.close();
			System.out.println("-------------");
		}
		
		
		scanner.close();
		
	}
	
}
