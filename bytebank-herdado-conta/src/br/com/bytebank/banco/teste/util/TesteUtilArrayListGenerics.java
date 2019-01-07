package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;;

public class TesteUtilArrayListGenerics {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList();
//		ArrayList<Conta> contas = new ArrayList<Conta>();
		System.out.println("contas.size() : " + contas.size());
		
		ContaCorrente cc1 = new ContaCorrente(123, 456);
		ContaCorrente cc2 = new ContaCorrente(123, 567);
		ContaPoupanca cp1 = new ContaPoupanca(123, 678);
		ContaPoupanca cp2 = new ContaPoupanca(123, 789);
		
		Cliente cli1 = new Cliente();
		
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cp1);
		contas.add(cp2);
		
		System.out.println("contas.size() : " + contas.size());
		
		for( Conta c: contas ) {
			System.out.println(c.getNumero());
		}
		
	}

}
