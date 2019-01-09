package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacaoLista {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
		Conta cc2 = new ContaPoupanca(22, 44);
		Conta cc3 = new ContaCorrente(22, 11);
		Conta cc4 = new ContaPoupanca(22, 22);
		
		ArrayList<Conta> lista = new ArrayList<>();
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for( Conta c : lista ) {
			System.out.println("c : " + c.getSaldo());
		}
		System.out.println("-----------------");
		cc1.deposita(333);
		cc2.deposita(444);
		cc3.deposita(111);
		cc4.deposita(222);
		
		for( Conta c : lista ) {
			System.out.println("c : " + c.getSaldo());
		}
		System.out.println("-----------------");		
		
		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		
		lista.sort(comparator);
		
		for( Conta c : lista ) {
			System.out.println("c : " + c.getSaldo());
		}
		
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		
		if( o1.getNumero() < o2.getNumero() ) {
			return -1;
		}
		if( o1.getNumero() > o2.getNumero() ) {
			return 1;
		}		
		return 0;
	}
	
}
