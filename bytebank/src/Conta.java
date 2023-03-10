
class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	String cpf;
	String profissao;
	
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

}