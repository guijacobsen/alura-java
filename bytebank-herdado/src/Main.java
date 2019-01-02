
public class Main {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();		
		g1.setSalario(1550);
//		g1.salario = 1600;
		
		g1.setNome("Guilherme");
		System.out.println( "Nome: " + g1.getNome() );
		System.out.println( "Salario: " + g1.getSalario() );
		System.out.println( "Bonificacao: " + g1.getBonificacao() );
		
		g1.setSenha(2222);
		
		if( g1.autentica(2222) ) {
			System.out.println("Autentica true");
		} else {
			System.out.println("Autentica false");
		}
		
	}
	
}
