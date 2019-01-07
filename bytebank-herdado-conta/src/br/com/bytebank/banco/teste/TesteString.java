package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteString extends Object {

	public static void main(String[] args) {
		
		String nome = "Jonas";
//		String outro = new String("Jonas");
		
		StringBuilder jonas = new StringBuilder("Meu nome eh Jonas");
		
		Object obj = null;
		
		Object string = "string obj";
		System.out.println( string );
		
		Cliente clijonas = new Cliente();
		
		clijonas.setNome("Jonaaas");
		
		System.out.println( clijonas.getNome() );
		System.out.println( clijonas.getNome().toString() );
		
		System.out.println("--------- x----------x--------");
		
		
		System.out.println( jonas );
		
		jonas = jonas.append(" e tenho 25 anos");
		jonas.append(" e tenho 25 anos");
		
		System.out.println( jonas );
		System.out.println("--------");
		
		System.out.println( "nome: " + nome );
		System.out.println( "replace Jo -> j0: " + nome.replace("Jo", "j0") );
		
		System.out.println( "nome.indexOf(Jo) : " + nome.indexOf("Jo") );
		System.out.println( "nome.indexOf(na) : " + nome.indexOf("na") );
		
		System.out.println( "nome.chatAt(3) : " + nome.charAt(3) );
		System.out.println( "nome.chatAt(3) : " + nome.charAt(3) );

		
		System.out.println( "nome.length() : " + nome.length() );
		
		if( nome.isEmpty() ) {
			System.out.println("nome.isEmpty() true");
		} else {
			System.out.println("nome.isEmpty() false");			
		}
		
		
//		System.out.println( outro );
//		
//		
//		nome = nome.replace('A', 'a');
//
//		String nome2 = nome.toLowerCase();
//				
//		
//		System.out.println( nome );
//		System.out.println( nome2 );
		
	}
	
}
