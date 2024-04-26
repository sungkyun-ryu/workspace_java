package com.ruby.java.ch07;

public class GalaxyMessenger implements Messenger, WorkFile{

	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("Message= " + msg);
	}

	@Override
	public void fileUpload() {
	
	}

	@Override
	public void fileDownload() {
	
	}
}
