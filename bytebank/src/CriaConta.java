
public class CriaConta {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		
		System.out.println("Saldo Paulo: " + contaDoPaulo.saldo);
		contaDoPaulo.deposita(300);
		System.out.println("Paulo depositou 300");
		System.out.println("Saldo Paulo: " + contaDoPaulo.saldo);
		System.out.println("----------------------------");
		if( contaDoPaulo.saca(30) ) {
			System.out.println("Paulo Conseguiu sacar 30");
		} else {
			System.out.println("Paulo Nao conseguiu sacar 30");
		}
		System.out.println("Saldo Paulo: " + contaDoPaulo.saldo);
		System.out.println("----------------------------");
		
		Conta contaDaMarcela = new Conta();
		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);
		contaDaMarcela.deposita(1000);
		System.out.println("Marcela depositou 1000 reais");
		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);
		System.out.println("----------------------------");
		
		if( contaDaMarcela.transfere(300, contaDoPaulo) ) {
			System.out.println("Marcela conseguiu transferir 300 reais pro Paulo");		
		} else {
			System.out.println("Marcela nao conseguiu transferir 300 reais pro Paulo");
		}
		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);
		System.out.println("Saldo Paulo: " + contaDoPaulo.saldo);
		System.out.println("----------------------------");
		
		System.out.println("Titular conta Paulo: " + contaDoPaulo.titular);
		System.out.println("Titular conta Marcela: " + contaDaMarcela.titular);
		System.out.println("----------------------------");
		
		if( contaDoPaulo.titular != null ) {
			System.out.println("Paulo tem nome");
		} else {
			System.out.println("Paulo nao tem nome");
		}
		
	}

}
