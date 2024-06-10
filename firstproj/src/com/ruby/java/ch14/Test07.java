package com.ruby.java.ch14;

@FunctionalInterface
interface StringFunc {
	String modify(String s);
}

public class Test07 {

	static String test(StringFunc sf, String s) {// sf represents an instance which has the method modify
		return sf.modify(s);
	}

	public static void main(String[] args) {

		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		StringFunc sf1 = (s) -> { //sf1 is an instance of which method is removing commas,
			String result = "";
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (c == ',')
					result += " ";
				else
					result += c;
			}
			return result;
		};

		String s1 = test(sf1, str); //test method runs the method of sf1 taking in str as an argument.
		System.out.println(s1);

		
		//interface 를 implements 하는 인스턴스 생성을 먼저하지 않고 여기서 바로생성
		//test method 는 어차피 인스턴스의 메소드만 필요하기 때문에 인스턴스를 미리 생성할 필요 없음
		//그렇다면 test method 에서 바로 메소드를 declare 해버림 
		// String s1 의 경우에는 instance 를 생성하고 그 instance 를 argument 로 받아서 그 메소드를 사용.
		
		String s2 = test((s) -> { 
			int max = 0;			
			int index = 0;
			String[] word = s.split(",");
			for (int i = 0; i < word.length; i++) {
				if (max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index];
		}, str);
		System.out.println(s2);
	}
}