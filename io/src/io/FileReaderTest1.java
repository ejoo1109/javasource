package io;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderTest1 {

	public static void main(String[] args) {
		// Reader, Writer 사용 - 문자로 된 파일만 가능
		try (Reader reader = new FileReader("c:\\temp\\file1.txt")) {
			int ch=0;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
