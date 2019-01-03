
public class TesteSistemaInterno {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();		
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		
		Autenticavel a = new Gerente();
		Gerente ge = new Gerente();
		Funcionario f = new Gerente();
		
		Autenticavel cli = new Cliente();
		
		cli.setSenha(2221);
		si.autentica(cli);
		
		if( cli.autentica(2221) ) {
			System.out.println("Cliente autentica 2222");
		} else {
			System.out.println("Cliente nao autentica 2222");
		}
		
		Autenticavel au = new Cliente();
		Autenticavel ad = new Administrador();
		
		
		
	}
	
}
