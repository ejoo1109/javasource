package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderTest2 {

	public static void main(String[] args) {
		// Reader, Writer 사용 - 문자로 된 파일만 가능
		
		try (Reader reader = new FileReader("c:\\temp\\file1.txt") ;
		     Writer writer = new FileWriter("c:\\temp\\file1_copy2.txt")) {
			int ch=0;
			while((ch=reader.read())!=-1) {
				writer.write(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
