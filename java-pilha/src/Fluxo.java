
public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("--- inicio main ---");
		metodo1();
		System.out.println("--- final main ---");
	}
	
	private static void metodo1() {
		System.out.println("--- inicio metodo1 ---");
		metodo2();
		System.out.println("--- final metodo1 ---");
	}
	
	private static void metodo2() {
		System.out.println("--- inicio metodo2 ---");
		for( int i = 1; i <= 5; i++ ) {
			System.out.println("i : " + i);
		}
		System.out.println("--- final metodo2 ---");
	}

}
