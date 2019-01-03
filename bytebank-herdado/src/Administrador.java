
public class Administrador extends Funcionario implements Autenticavel {
	
	private int senha;
	
	@Override
	public double getBonificacao() {
		System.out.println("getBonificacao Administrador");
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}

	@Override
	public boolean autentica(int senha) {
		return this.senha == senha;
	}

}
