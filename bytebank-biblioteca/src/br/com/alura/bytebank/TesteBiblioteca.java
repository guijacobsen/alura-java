package br.com.alura.bytebank;


import br.com.bytebank.banco.modelo.*;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(123,345);
		
		cc.deposita(100);
		
		System.out.println( cc.getSaldo() );
		
	}
	
}
