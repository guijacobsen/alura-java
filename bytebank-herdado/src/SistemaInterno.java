
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		if( fa.autentica(this.senha) ) {
			System.out.println("Autentica true");
		} else {
			System.out.println("Autentica false");
		}
	}
	
	
}
