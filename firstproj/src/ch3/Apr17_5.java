package ch3;

import java.util.Scanner;

public class Apr17_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//	String nation= "KOR";
	Scanner sc= new Scanner(System.in);
	System.out.println("What is your nation?");
	String nation= sc.next();
	
	
	switch(nation) {
	case "KOR":
	case "JPN":
	case "CHN":
	{System.out.println("This region is East Asia"); break;
	}
	case "USA":
	case "GBR":
	case "GER":
	{System.out.println("This region is the West");
	}
	case "anything": System.out.println("Which region do you like more?");
	}
	}
}
