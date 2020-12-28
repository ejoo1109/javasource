package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputTest5 {

	public static void main(String[] args) {
		//try~with~resource
		//AutoCloseable을 구현한 객체만 사용이 가능하다.
		
		try {InputStream in =new FileInputStream (new File("c:\\temp\\schoolsong.mp3"));
		     OutputStream out =new FileOutputStream(new File("c:\\temp\\schoolsong_copy.mp3"));
//			in = new FileInputStream(new File("c:\\temp\\picture.jpg"));
//			out = new FileOutputStream(new File("c:\\temp\\picture_copy.jpg"));
		
			int data=0;
			long start = System.currentTimeMillis();///1/1000
//			while((data=in.read()) !=-1) {
//				out.write(data);
//			}
			byte[] b=new byte[1024];
			
			while(in.read(b)!=-1) {
				out.write(b);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사하는 데 걸린 시간 : "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();

			}
		}

	}

