package ch3;

public class Apr17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수 초기화 
		int score= 90;
		int score_1= 59;
		// 결과 문자열 초기화
		String result= "";
		// 60점 이상이면 합격
		if (score >= 60) {
			result= "Accepted";
		}
		// 결과 화면 출력
		System.out.println(result);
		System.out.println(score_1 >= 60 ? "Accepted" : "Rejected");
		
	}

}
