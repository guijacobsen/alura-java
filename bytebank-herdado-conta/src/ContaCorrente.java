
public class ContaCorrente extends Conta implements CalculadorImposto {
	
	private Tributavel tributavel;
	

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		this.tributavel = new Tributavel();
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImporto() {
		return this.tributavel.getValorImporto();
	} 
	
}
