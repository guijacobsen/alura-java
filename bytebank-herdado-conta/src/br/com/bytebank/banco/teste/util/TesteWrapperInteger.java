package br.com.bytebank.banco.teste.util;

import java.awt.List;
import java.util.ArrayList;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
//		Integer idadeRef = new Integer(idade); //depreciado
		
		Integer idadeRef = Integer.valueOf(idade);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);
		numeros.add(idade);
		numeros.add(idade);
		numeros.add(idadeRef);
		
//		for( Integer i : numeros ) {
//			System.out.println( i );
//		}
		
		System.out.println( idadeRef );
		System.out.println( idadeRef.intValue() );
		System.out.println( idadeRef.doubleValue() );
		System.out.println( idadeRef.equals(29) );

		System.out.println("min valur int: " + Integer.MIN_VALUE);
		System.out.println("max valur int: " + Integer.MAX_VALUE);
		System.out.println("size int: " + Integer.SIZE);
		
		System.out.println("bytes int: " + Integer.BYTES);
		
		
		String n = "10";
		int nn = Integer.valueOf(n);
		
//		int nnn = Integer.valueOf("10.1");
		int nnn = Integer.parseInt("10.1");
//		int nnn = Integer.parseUnsignedInt("10.1");
		
		System.out.println("Stirng n = " + n);		
		System.out.println(" n to int nn = " + nn );
		System.out.println(" string 10.1 to int nnn = " + nnn );
		
	}
	
}
