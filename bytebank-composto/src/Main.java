
public class Main {

	public static void main(String[] args) {
		
//		Conta conta = new Conta();
		Conta conta = new Conta(1000,2000);
		Conta conta2 = new Conta(1000,2001);
		Conta conta3 = new Conta(1000,2002);
		
		System.out.println("Total de contas eh: " + Conta.getTotal());
		
//		System.out.println("Total de contas eh: " + conta2.getTotal());
		

		System.out.println("Numero: " + conta.getNumero());
		System.out.println("Agencia: " + conta.getAgencia());
		Cliente paulo = new Cliente();
//		try {}
//		} catch(Exception err) {}
		
		paulo.setNome("Paulo silveira");
		conta.setTitular(paulo);		

		System.out.println("Nome: " + conta.getTitular().getNome());
		System.out.println("Profissao: " + conta.getTitular().getProfissao());
		conta.getTitular().setProfissao("Programador");
		System.out.println("Profissao: " + conta.getTitular().getProfissao());

	}

}
