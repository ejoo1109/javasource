package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class inputStreamTest3 {

	public static void main(String[] args) {
		// 바이트 기반의 InputStream 생성//in(키보드)
		InputStream in = System.in;
		//바이트 기반의 OutputStream 생성//out(모니터)
		OutputStream out=System.out;
		
		int input = 0;
		//ASCII 코드(영어,숫자) 한글은 부여가 안되어 있음
		//키보드의 모든 키들은 특정 숫자값이 부여되어 있음
		//A: 65, a:97 시작
		
		//입력 스트림에서 한 줄씩(-1) 읽어오기
		try {
			while((input=in.read())!=-1) {
			//System.out.println((char)input);
			out.write(input);
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
