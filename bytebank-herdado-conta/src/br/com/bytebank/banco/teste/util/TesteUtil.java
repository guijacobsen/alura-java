package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteUtil {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		System.out.println( "lista size: " + lista.size() );
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		ContaCorrente cc2 = new ContaCorrente(11, 33);
		
		lista.add(cc1);
		lista.add(cc2);
		
		System.out.println( "lista size: " + lista.size() );
		
		Conta ref = (Conta) lista.get(0);
		System.out.println( ref.getNumero() );
		
		lista.remove(0);
		System.out.println( "lista size: " + lista.size() );
		
		ContaPoupanca cp1 = new ContaPoupanca(11, 44);
		ContaPoupanca cp2 = new ContaPoupanca(11, 55);
		
		lista.add(cp1);
		lista.add(cp2);
		
		System.out.println( "lista size: " + lista.size() );
		
		for( int i = 0; i < lista.size(); i++ ) {
			Object obj = lista.get(i);
			System.out.println( obj.toString() );
		}
		System.out.println("-----------");
		for( Object o : lista ) {
			System.out.println( o );
		}
		
		
	}
	
}
