
class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int total;
	
	public Conta() {}
	
	public Conta(int agencia, int numero) {
		System.out.println("-----------------");
		System.out.println("construtor conta");
		
		Conta.total++;
		
		this.agencia = agencia;
		this.numero = numero;		
		System.out.println("-----------------");
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if( this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if( this.saldo >= valor ) {
			this.saldo -= valor;
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
}