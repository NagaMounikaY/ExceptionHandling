package com.crimsonlogic.ExceptionhandlingExmples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
	public static void main(String[] args) throws FileNotFoundException {
		File fileObj=new File("sample.txt");
		Scanner myScanner=new Scanner(fileObj);
		while(myScanner.hasNext()) {
			String line=myScanner.nextLine();
			System.out.println(line);
			
		}
		myScanner.close();
	}

}
