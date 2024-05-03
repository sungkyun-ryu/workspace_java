package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.PrintStream;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fi= new FileInputStream("m.txt")) {
//				PrintStream console = System.out; ) 
			int c = 0; 
			
			while((c=fi.read()) != -1) {
//				if(c == '\n') {
//					System.out.println("줄  바  꿈");
//				} else {
//					System.out.write(c);
//				}
				System.out.write(c);
				
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
