package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		ContaCorrente cc2 = new ContaCorrente(11, 33);
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		System.out.println( "Total elementos: " + guardador.getQuandidadeDeElementos() );
		
		guardador.adiciona(cc1);
		guardador.adiciona(cc2);
		
		System.out.println( "Total elementos: " + guardador.getQuandidadeDeElementos() );
		
		System.out.println( guardador.getReferencia(0).getNumero() );
		System.out.println( guardador.getReferencia(1).getNumero() );
		
	}
	
}
