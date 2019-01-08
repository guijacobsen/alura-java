package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;;

public class TesteUtilArrayListEquals {
	
	public static void main(String[] args) {
		
//		ArrayList<Conta> contas = new ArrayList<>();
		LinkedList<Conta> contas = new LinkedList<>();
		
		ContaCorrente cc1 = new ContaCorrente(123, 456);
		ContaPoupanca cp1 = new ContaPoupanca(123, 789);
		
		ContaPoupanca cp2 = new ContaPoupanca(123, 789);
		
		contas.add(cc1);
		contas.add(cp1);
		
		
		for( Conta c: contas ) {
			System.out.println(c);
		}
		
		System.out.println("-----------------");
		
		System.out.println( "array contas contem cp2? " + contas.contains(cp2) );
		
		
	}

}
