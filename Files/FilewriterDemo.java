package com.java.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class FilewriterDemo {
	public static void main(String[] args) throws IOException {

		File f2 = new File("c:\\havi2\\xyz.txt");
		f2.createNewFile();
		try (FileWriter f1 = new FileWriter(f2); FileReader fr = new FileReader(f2);) {

			f1.write("it is a file\n");

			f1.write("havi");
			f1.write("solutions");
			f1.write("49");

			f1.flush();

			f1.close();

			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
