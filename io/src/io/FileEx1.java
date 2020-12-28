package io;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		//파일 객체 생성
		File f1 = new File("c:\\temp\\test1.txt");
		File f2 = new File("c:\\temp","test1.txt"); //부모 차일드
		
		File dir = new File("c:\\temp\\"); //파일 만들어주기
		File f3 = new File(dir,"test1.txt");
		
		

	}

}
