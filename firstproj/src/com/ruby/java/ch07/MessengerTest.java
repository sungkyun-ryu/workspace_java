package com.ruby.java.ch07;

public class MessengerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//같은 인터페이스 사용
		IPhoneMessenger iphone = new IPhoneMessenger(); 
		iphone.getMessage();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		galaxy.getMessage(); 
	}

}
