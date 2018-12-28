
public class TestaCondicional {
	
	public String opa = "opa";
	
	public void opa() {
		System.out.println("Opa");
	}

	public static void main(String[] args) {

		int idade = 1;
		int quantidadePessoas = 1;
		
//		int cont = 0;
		for( int cont = 0; cont <= 10; cont++ ) {
			System.out.println(cont);
		}
		
		switch( idade ) {
		
			case 1:
				System.out.println("Idade = 1");
				break;
			case 2:
				System.out.println("Idade = 2");
				break;
			case 'a':
				System.out.println("Idade = a");
				break;
//			case "ab":
//				System.out.println("Idade = ab");
			case 16:
				System.out.println("Idade = 16");
				break;
			default:
				System.out.println("Idade default");
				
		
		}

		if (idade >= 18) {
			System.out.println("Voce eh maior de idade");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Voce eh menos de idade");
			if( quantidadePessoas >= 2 ) {
				System.out.println("Pode entrar pois esta acompanhado");
			} else {
				System.out.println("Infelizmente nao pode entrar");
			}

		}
		
		int zero = 0;
		if( zero == 1 ) {
			System.out.println("0 true");
		} else {
			System.out.println("0 false");
		}

	}

}
