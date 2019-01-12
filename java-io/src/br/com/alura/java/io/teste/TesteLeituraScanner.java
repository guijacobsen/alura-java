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
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.println(tipoConta + agencia + numero + titular + saldo);
			
			String valorFormatado = String.format("%s - %04d-%d, %s: %010.2f", tipoConta, agencia, numero, titular, saldo);
//			String valorFormatado2 = String.format(Locale.US ,"%s - %04d-%d, %s: %010.2f", tipoConta, agencia, numero, titular, saldo);
//			String valorFormatado2 = String.format(Locale.GERMANY ,"%s - %04d-%d, %s: %010.2f", tipoConta, agencia, numero, titular, saldo);
			String valorFormatado2 = String.format(new Locale("pt", "BR") ,"%s - %04d-%d, %s: %010.2f %n", tipoConta, agencia, numero, titular, saldo);
			System.out.println(valorFormatado);
			System.out.println(valorFormatado2);
			
			linhaScanner.close();
			System.out.println("-------------");
			
		}
		
		
		scanner.close();
		
	}
	
}
