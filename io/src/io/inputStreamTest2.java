package io;

import java.io.IOException;
import java.io.InputStream;

public class inputStreamTest2 {

	public static void main(String[] args) {
		// 바이트 기반의 InputStream 생성
		InputStream in = System.in;
		
		
		//ASCII 코드(영어,숫자) 한글은 부여가 안되어 있음
		//키보드의 모든 키들은 특정 숫자값이 부여되어 있음
		//A: 65, a:97 시작
		
		//입력 스트림에서 한 바이트씩 읽어오기
		try {
			int input = in.read();
			System.out.println((char)input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
