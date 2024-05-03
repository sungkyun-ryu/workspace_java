package com.ruby.java.ch12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserBean user = new UserBean("honghong", "홍길동", "010-123-1234", "부산" );
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.txt"))) {
			out.writeObject(user);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
