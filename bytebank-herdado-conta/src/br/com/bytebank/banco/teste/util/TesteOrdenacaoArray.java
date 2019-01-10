package br.com.bytebank.banco.teste.util;

import java.util.Arrays;

public class TesteOrdenacaoArray {

	public static void main(String[] args) {
		
		int[] numeros = new int[] {3,4,2,4,54,36,12};
		
		
		Arrays.sort(numeros);
		
		System.out.println( Arrays.toString(numeros) );
		
	}
	
}
