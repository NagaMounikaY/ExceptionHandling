package com.crimsonlogic.ExceptionhandlingExmples;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMain {
	public static void main(String[] args) throws FileNotFoundException {
		PalindromeUsingFile p= new PalindromeUsingFile();
		p.readingingFile();
		p.writingFile();
	}

}
