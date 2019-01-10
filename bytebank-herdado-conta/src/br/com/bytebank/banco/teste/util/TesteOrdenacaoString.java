package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacaoString {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente c1 = new Cliente();
		c1.setNome("Jonas");
		cc1.setTitular(c1);
		cc1.deposita(333);
		
		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente c2 = new Cliente();
		c2.setNome("Guilherme");
		cc2.setTitular(c2);
		cc2.deposita(444);
		
		Conta cc3 = new ContaCorrente(22, 11);
		Cliente c3 = new Cliente();
		c3.setNome("Natalia");
		cc3.setTitular(c3);
		cc3.deposita(111);
		
		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente c4 = new Cliente();
		c4.setNome("Gabriela");
		cc4.setTitular(c4);
		cc4.deposita(222);
		
		ArrayList<Conta> lista = new ArrayList<>();
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		

		
		System.out.println("Listagem original:");
		for( Conta c : lista ) {
			System.out.println(c.getAgencia() + "-" + c.getNumero() + " - " + c.getTitular().getNome());
		}
		System.out.println("-----------------------------");
		
//		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
//		lista.sort(comparator);
		lista.sort(new NumeroDaContaComparator());
		System.out.println("Listagem ordenando por conta:");
		for( Conta c : lista ) {
			System.out.println(c.getAgencia() + "-" + c.getNumero() + " - " + c.getTitular().getNome());
		}
		System.out.println("-----------------------------");
		
		System.out.println("Listagem ordenando por nome:");
		TitularDaContaComparator titularComparator = new TitularDaContaComparator();				
		lista.sort(titularComparator);
		for( Conta c : lista ) {
			System.out.println(c.getAgencia() + "-" + c.getNumero() + " - " + c.getTitular().getNome());
		}
		
	}
	
}

class TitularDaContaComparator implements Comparator<Conta> {
	
	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		return nomeC1.compareTo(nomeC2);
		
	}
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		
		return Integer.compare(o1.getNumero(), o2.getNumero());
		
//		return o1.getNumero() - o2.getNumero();
		
//		if( o1.getNumero() < o2.getNumero() ) {
//			return -1;
//		}
//		if( o1.getNumero() > o2.getNumero() ) {
//			return 1;
//		}		
//		return 0;
	}
	
}
