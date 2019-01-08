package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {
	
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);
		System.out.println( "idadeRef : " + idadeRef );
		System.out.println( "idadeRef.intValue() : " + idadeRef.intValue() );
		
		Double dRef = Double.valueOf(3.2);
		System.out.println("double: " + dRef);
		System.out.println("double.doubleValue(): " + dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE;
		
		System.out.println("bRef : " + bRef);
		System.out.println("bRef.booleanValue() : " + bRef.booleanValue());
		
//		Number refNumero = Integer.valueOf(11);
		Number refNumero = Double.valueOf(10.1);
		
		System.out.println("Number refNumero = " + refNumero);
		System.out.println("Number refNumero.byteValue() = " + refNumero.byteValue());
		System.out.println("Number refNumero.byteValue() = " + refNumero.floatValue() );
		System.out.println("Number refNumero.byteValue() = " + refNumero.intValue() );
		
		List<Number> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(11);
		numeros.add(12.3);
		numeros.add(32.8f);
		
		for( Number n : numeros ) {
			System.out.println("numero item : " + n);
		}
		
	}

}
