package com.hacker.rank;

import java.io.File;
import java.io.IOException;

public class MyTestFile {

	public static void main(String[] args) {
		File file = new File("./Person1.java");
		
		if(file.exists()) {
			System.out.println(file.getName());
		}else {
			try {
				boolean newFile = file.createNewFile();
				if(newFile) {
					System.out.println(file.getAbsolutePath()+  file.getName());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
