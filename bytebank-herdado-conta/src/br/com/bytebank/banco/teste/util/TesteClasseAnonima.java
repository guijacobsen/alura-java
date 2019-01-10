package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteClasseAnonima {

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
		
		System.out.println("Listagem original: ");
		System.out.println("-----------------------------");
		for( Conta c : lista ) {
			System.out.println(c + " - " + c.getTitular().getNome());
		}
		System.out.println("-----------------------------");
		

		
//		lista.sort(new Comparator<Conta>() {
//			@Override
//			public int compare(Conta c1, Conta c2) {
//				return Integer.compare(c1.getNumero(), c2.getNumero());
//			}
//		});
		
//		lista.sort(
//				(Conta cl1, Conta cl2) -> {
//					return Integer.compare(cl1.getNumero(), cl2.getNumero());
//				}
//			);
		
		lista.sort(
			(Conta cl1, Conta cl2) -> Integer.compare(cl1.getNumero(), cl2.getNumero())
			);
		
		
		System.out.println("Listagem ordenada: ");
		System.out.println("-----------------------------");
		for( Conta c : lista ) {
			System.out.println(c + " - " + c.getTitular().getNome());
		}
		System.out.println("-----------------------------");
		
//		lista.sort(new Comparator<Conta>() {
//			@Override
//			public int compare(Conta c1, Conta c2) {
//				String nomeC1 = c1.getTitular().getNome();
//				String nomeC2 = c2.getTitular().getNome();
//				
//				return nomeC1.compareTo(nomeC2);
//			}
//		});
		
		lista.sort(
				(cl1, cl2) -> {
					String nomeC1 = cl1.getTitular().getNome();
					String nomeC2 = cl2.getTitular().getNome();
					return nomeC1.compareTo(nomeC2);
				}
		);
		
		System.out.println("Listagem ordenada por nome: ");
		System.out.println("-----------------------------");
		for( Conta c : lista ) {
			System.out.println(c + " - " + c.getTitular().getNome());
		}
		System.out.println("-----------------------------");
		
		System.out.println("-------- Foreach --------");
		
		lista.forEach(ct -> 
			System.out.println(ct)
		);
		
		
	}
	
}

