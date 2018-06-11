package com.kd.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

public class IOMain {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		PrintWriter writer = null;
		int i = 0;
		try {
			reader = new BufferedReader(new FileReader(new File("src/resources/abc.txt")));
			writer = new PrintWriter(new File("src/resources/out.txt"));
			LinkedHashSet<String> words = new LinkedHashSet<>();
			String line = reader.readLine();
			while (line != null) {
				words.removeAll(words);
				words.addAll(Arrays.asList(line.split(" ")));
				i = 0;
				for (String str : words) {
					if (i == 0)
						writer.write(str.trim());
					else
						writer.write(" " + (str.trim()));
					i++;
				}
				writer.write("\n");
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			reader.close();
			writer.close();
		}
		
	}

}
