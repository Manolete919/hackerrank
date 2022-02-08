package com.hacker.rank;

import java.io.IOException;
import java.nio.file.*;


public class CreateAFileAtSpecificLocation {
	
	public static void main(String[] args) {
		Path path = Paths.get("d:/prueba2.txt");
		
		try {
			Path p= java.nio.file.Files.createFile(path);
			System.out.println(p);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
