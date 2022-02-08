package com.hacker.rank;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileUsingFileOutputStream {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		try {
			FileOutputStream fos = new FileOutputStream(name,true);
			String contenido = sc.nextLine();
			sc.close();
			byte[] bytes = contenido.getBytes();
			fos.write(bytes);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
