package com.crimsonlogic.ExceptionhandlingExmples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExamples {
	public static void main(String[] args) throws IOException {
		try {
		File fileObj=new File("textFile.txt");
		if(fileObj.createNewFile()) {
			System.out.println("file created"+fileObj.getAbsolutePath());
		}else {
			System.out.println("File already exists");
		}
		FileWriter myFileWriter=new FileWriter("testFile.txt");
		myFileWriter.write("java is object oriented programing languagge");
		myFileWriter.close();
		System.out.println("sucessfully written in to the file");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
