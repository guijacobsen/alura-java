package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		long ini = System.currentTimeMillis();
		
//		PrintStream ps = new PrintStream("lorem-printStream.txt");
//		PrintWriter ps = new PrintWriter("lorem-printStream.txt");
//		PrintWriter ps = new PrintWriter("lorem-printStream.txt", "UTF-8");
		PrintWriter ps = new PrintWriter("lorem-printStream.txt", "ASCII");

		ps.println("Lorem ipsum dolor sit amet, conéão É íççç ç opa ç  sectetur adipiscing elit,");
		ps.println();
		ps.print("Lorem ipsum dolor sit amet, consectetur adipiscing sasasasa sasas");
		
		ps.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo de execucao em milisegundos: " + (fim - ini));
		
		
	}

}
