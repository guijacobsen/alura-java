package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	protected double saldo;
	public double saldoVisivel;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	private static int total;
	
	/**
	 * Construtor da classe Conta 
	 * 
	 * @param agencia
	 * @param numero
	 *
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++;		
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);

	public boolean saca(double valor) {
		if( this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if( this.saca(valor) ) {
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public boolean ehIgual(Conta conta) {
		return ( (conta.getAgencia() == this.getAgencia()) && (conta.getNumero() == this.getNumero()) );
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		return ( (conta.getAgencia() == this.getAgencia()) && (conta.getNumero() == this.getNumero()) );
	}
	
	@Override
	public String toString() {
		return "Conta - ag: " + this.getAgencia() + " num: " + this.getNumero() + ", saldo: " + this.saldo;
	}
	
	@Override
	public int compareTo(Conta c) {
		return Double.compare(this.saldo, c.saldo);
//		return Double.compare(this.numero, c.numero);
	}
}