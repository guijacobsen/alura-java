package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;


public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

//		Cliente cliente = new Cliente();
//		cliente.setNome("Guilherme Jacobsen");
//		cliente.setProfissao("Developer");
//		cliente.setCpf("43131637862");
//		
//		ContaCorrente cc = new ContaCorrente(222, 333);
//		cc.deposita(222.3);
//		cc.setTitular(cliente);
//
//		ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("cc.bin") );
//		oos.writeObject(cc);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream( new FileInputStream("cc.bin") );
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		
		System.out.println( "Leitura de cc.bin completo." );
		System.out.println( cc.getSaldo() );
		System.out.println( cc.getTitular().getNome() );
		
	}

}
