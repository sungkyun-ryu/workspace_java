package ch6;

import java.util.ArrayList;
import java.util.List;

public class scratch {	
	
	public static class Na {
		int x;
		
		public Na(int x) {
			this.x = x;
		}
		public String toString() { 
			return String.valueOf(x); 
		}
	}
	/// 실험, Stack에 넣어놓고도 속성을 변경시킬 수 있음 => 미로찾기에서 했던 실수.	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Na a = new Na(3); 
		Na b = new Na(4);
		List<Na> arr = new ArrayList<>();
		arr.add(a); a.x = 100; 
		System.out.println(arr.get(0).toString());
				
	}
	
}
