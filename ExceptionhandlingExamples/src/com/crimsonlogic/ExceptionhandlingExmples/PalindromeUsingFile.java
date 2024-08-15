package com.crimsonlogic.ExceptionhandlingExmples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeUsingFile {
	
	Scanner s=new Scanner(System.in);
	List<String> palindrome=new ArrayList<>();
	List<String> notPalindrome=new ArrayList<>();
	
	public void readingingFile() throws FileNotFoundException {
		File fileObj = new File("Palindrom.txt");
		try {
			if (fileObj.createNewFile()) {
				System.out.println("file created" + fileObj.getAbsolutePath());
			} else {
				System.out.println("File already exists");
			}
			FileWriter fileWriter=new FileWriter("Palindrom.txt");
			System.out.println("enter the string:");
			fileWriter.write(s.nextLine());
			fileWriter.close();
			System.out.println("sucessfully written in to the file");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(fileObj);
		while (sc.hasNextLine()) {
			String line = sc.next();
			ispalindromOrNot(line);
		}
	

	}
	
	
	
	public void ispalindromOrNot(String str1) {
		StringBuffer sb=new StringBuffer(str1);
		StringBuffer str2 = sb.reverse();
		if(str1.equals(str2.toString())) {
			palindrome.add(str2.toString());
		}else {
			notPalindrome.add(str2.toString());
		}
	}
	
	public void writingFile() throws FileNotFoundException {
		try {
			File f = new File("output.txt");
			FileWriter file = new FileWriter("output.txt");
			for (String word : palindrome) {
				file.write(word + "\t");
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
}
