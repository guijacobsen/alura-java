
public class TesteConexao {

	public static void main(String[] args) {
		
		try( Conexao conexao = new Conexao() ) {
			conexao.leDados();
		} catch( Exception ex ) {
			System.out.println("Erro na conexao");
			ex.printStackTrace();
		}
		
		
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch( Exception ex ) {
//			System.out.println("Erro na conexao");
//			ex.printStackTrace();
//		} finally {
//			if( con != null ) {
//				con.fecha();
//			}
//		}
		
	}
	
}
