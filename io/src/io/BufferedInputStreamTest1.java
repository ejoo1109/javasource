package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamTest1 {
	//보조 스트림
	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("c:\\temp\\file1.txt");
			 BufferedInputStream bis = new BufferedInputStream(in);
		     OutputStream out = new FileOutputStream("c:\\temp\\file1_copy3.txt");
				BufferedOutputStream bos = new BufferedOutputStream(out)) {
			
			int data=0;
			while((data=in.read())!=1) {
				bos.wait(data);
			}
			
		}catch(Exception e)	{
		e.printStackTrace();
	}

}

}
