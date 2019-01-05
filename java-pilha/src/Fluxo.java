
public class Fluxo {
	
	public static void main(String[] args) throws Exception {
		System.out.println("--- inicio main ---");
		try {
			metodo1(0);
		} catch( Exception ex ) {
			System.out.println("-----------");
			System.out.println( "Exception: " + ex.getMessage() );
			
			
			ex.printStackTrace();
			
			System.out.println("-----------");
		}
		System.out.println("--- final main ---");
	}
	
	private static void metodo1(int i) throws Exception {
		System.out.println("--- inicio metodo1 ---");
		System.out.println("i : " + i);
		
//		metodo1(++i);
		
		throw new MinhaExcecao("Error opaaaa");
//		throw new MinhaExcecaoException("Error opaaaa");
		
//		Conta conta = new Conta();
////		Conta conta = null;
//		conta.deposita(100);
//		
//		metodo2();
//		System.out.println("--- final metodo1 ---");
	}
	
	private static void metodo2() {
		System.out.println("--- inicio metodo2 ---");
		
		for( int i = 1; i <= 5; i++ ) {
			System.out.println("i : " + i);
			
			int a = i / 0;
		}
		System.out.println("--- final metodo2 ---");
	}

}
