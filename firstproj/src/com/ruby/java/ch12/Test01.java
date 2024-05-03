package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fi = new FileInputStream("a.txt");
				FileOutputStream fo = new FileOutputStream("b.txt");) {
			int c= 0;
			char d; 
			while((c=fi.read()) != -1) {
				d = (char) c; 
				fo.write(c);
				System.out.println("int: " + c + "  char: " + d);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
