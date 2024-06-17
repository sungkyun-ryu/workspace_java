package ch6;

class Term implements Comparable<Term>{
    double coef;           // 계수
    int    exp;            // 지수
    
    public Term(double coef, int exp) {
    	this.coef = coef; 
    	this.exp = exp; 
    }
    
    public int compareTo(Term t) {
    	if(this.exp != t.exp) return this.exp - t.exp;
    	else {
    		if(this.coef != t.coef) return (int)((this.coef - t.coef)*10);
    	}
    	return 0; 
    }
}

public class Test_다항식merge연산 {

	static void merge(Term[] a, int lefta, int righta, int leftb, int rightb ) {

	}

	// --- 퀵 정렬(비재귀 버전)---//
	static void MergeSort(Term[] a, int left, int right) {
		int mid = (left+right)/2;
		if (left == right) return;
		MergeSort(a, left, mid);
		MergeSort(a, mid+1, right);
		merge(a, left, mid, mid+1, right);
		return;
	}
	
	

	public static void main(String[] args) {
		Term[] polynomialX = {
		         new Term(1.5, 3),
		         new Term(2.5, 7),
		         new Term(3.3, 2),
		         new Term(4.0, 1),
		         new Term(2.2, 0),
		         new Term(3.1, 4),
		         new Term(3.8, 5),
		     };
		Term[] polynomialY = {
		         new Term(1.5, 1),
		         new Term(2.5, 2),
		         new Term(3.3, 3),
		         new Term(4.0, 0),
		         new Term(2.2, 4),
		         new Term(3.1, 5),
		         new Term(3.8, 6),
		     };
		int nx = polynomialX.length;


		ShowPolynomial(polynomialX); // e.g f(x) = 5x ** 2 + 2x + 1;
		ShowPolynomial(polynomialY);
		MergeSort(polynomialX, 0, polynomialX.length - 1); // 배열 x를 퀵정렬
		MergeSort(polynomialY, 0, polynomialY.length - 1); // 배열 x를 퀵정렬
		ShowPolynomial(polynomialX);
		ShowPolynomial(polynomialY);
		Term[] z = new Term[20];
		AddTerm(polynomialX,polynomialY,z);//다항식 덧셈 z = x + y
		ShowPolynomial(z);
		ShowPolynomial(polynomialY);
		MultiplyTerm(polynomialX,polynomialY,z);//다항식 곱셈 z = x * y
		ShowPolynomial(polynomialY);
		int result = EvaluateTerm(z, 10);//다항식 값 계산 함수 z(10) 값 계산한다 
		System.out.println(" result = " + result );
	}
}
