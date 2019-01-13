package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {
		
		long ini = System.currentTimeMillis();
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Guilherme Jacobsen");
//		cliente.setProfissao("Developer");
//		cliente.setCpf("43131637862");
//		
//		ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("cliente.bin") );
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream( new FileInputStream("cliente.bin") );
		Cliente cliente = (Cliente) ois.readObject();
//		cliente = (Cliente) ois.readObject();
		ois.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println( "Leitura de cliente.bin completo." );
		System.out.println( cliente.getNome() );
		System.out.println( cliente.getProfissao() );
		System.out.println( cliente.getCpf() );
		
		System.out.println("Tempo de execucao em milisegudos: " + (fim - ini));
		
	}
	
}
