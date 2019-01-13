package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		long ini = System.currentTimeMillis();
		
		String nome = "Guilherme Jacobsen";
		ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("objeto.bin") );
		oos.writeObject(nome);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream( new FileInputStream("objeto.bin") );
//		String text = (String) ois.readObject();
		nome = (String) ois.readObject();
		ois.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println( "Leitura de objeto.bin completo." );
		System.out.println(nome);
		
		System.out.println("Tempo de execucao em milisegudos: " + (fim - ini));
		
	}
	
}
