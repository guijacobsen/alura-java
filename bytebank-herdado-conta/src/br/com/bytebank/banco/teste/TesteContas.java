package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1111, 2222);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 3333);
		cp.deposita(200);
		
//		System.out.println( "cc saldo: " + cc.getSaldo() );
//		System.out.println( "cp saldo: " + cp.getSaldo() );
//		
//		cc.transfere(10, cp);
//		
////		cp.transfere(2, cc);
//		
//		System.out.println( "cc saldo: " + cc.getSaldo() );
//		System.out.println( "cp saldo: " + cp.getSaldo() );
//		
//		cc.saldo += 1000;
//		System.out.println( "cc saldo: " + cc.getSaldo() );
		
		System.out.println( "cc getValorImporto: " + cc.getValorImposto() );
		
		SeguroDeVida segurodevida = new SeguroDeVida();
		
		System.out.println( "seguro de vida getValorImporto: " + segurodevida.getValorImposto() );
		
		
	}
	
}
