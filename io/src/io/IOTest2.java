package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOTest2 {
	public static void main(String[] args) {
		// 아무파일이나 선택한 후 소스 파일을 읽고 
		// 라인번호를 추가시켜 화면에 출력하기
		//c:\Users\soldesk\eclipse-workspace\io
		String path = System.getProperty("user.dir");
	//System.out.println(path);
		
		try(FileReader reader = new FileReader(path+"\\src\\io\\FileEx1.java");
			BufferedReader br=new BufferedReader(reader)) {

			String data=null;
			int i = 1;
			while((data=br.readLine())!=null) {
				System.out.println((i++) + " "+ data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}

