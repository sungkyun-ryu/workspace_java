package com.ruby.java.ch07;

public interface Messenger {
	//field
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	
	//method	
	public abstract String getMessage();

	public abstract void setMessage(String msg);

	public default void setLogin(boolean login) {
		log();
		if (login) {
			System.out.println("You are logged in.");
		} else {
			System.out.println("Successfully logged out.");
		}
	}

	public static void getConnection() {
		System.out.println("Connecting to network.");
	}

	private void log() {
		System.out.println("start job!");
	}
}