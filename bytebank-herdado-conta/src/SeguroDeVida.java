
public class SeguroDeVida implements CalculadorImposto {
	
	private Tributavel tributavel;
	
	public SeguroDeVida() {
		this.tributavel = new Tributavel();
	}

	@Override
	public double getValorImporto() {
		return this.tributavel.getValorImporto();
	}

}
