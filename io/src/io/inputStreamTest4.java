package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class inputStreamTest4 {

	public static void main(String[] args) {
		// 바이트 기반의 InputStream 생성//in(키보드)
		InputStream in = System.in;
		//바이트 기반의 OutputStream 생성//out(모니터)
		OutputStream out=System.out;
		
		//입력 스트림에서 바이트 배열로 읽어오기
		byte[] b= new byte[100];
		
		try {
			while((in.read(b))!=-1) {
			//System.out.println((char)input);
			out.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
					
	}
		}
}
}