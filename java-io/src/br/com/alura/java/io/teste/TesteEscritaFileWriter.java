package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("lorem-fileWriter");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit,");
		bw.newLine();
		bw.newLine();
		bw.write("uahsuahsu hasuaush ausuas uahsu ahs");
		bw.close();
		
//		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit,");
//		fw.write("\n");
//		fw.write(System.lineSeparator());
//		fw.write("uahsuahsu hasuaush ausuas uahsu ahs");
//		fw.write(System.lineSeparator());
//		fw.write("uahsuahsu hasuaush ausuas uahsu ahs");		
//		fw.close();
		
		
	}

}
