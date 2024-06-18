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
		Term[] c = new Term[a.length]; int n= 0; 
		while(lefta <= righta && leftb <= rightb) {
			if(a[lefta].compareTo(a[leftb]) <= 0) {
				c[n++] = a[lefta++];
			} else c[n++] = a[leftb++]; 
		}
		if (lefta <= righta) {
			for (int i = lefta; i <= righta; i++) {
				c[n++] = a[lefta++]; 
			}
		}
		if (leftb <= rightb) {
			for (int i = leftb; i <= rightb; i++) {
				c[n++] = a[leftb++];
			}
		}
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

	static void ShowPolynomial(Term[] poly) {
		for(int i = 0; i < poly.length; i++) {
			if(poly[i].exp >= 2) 
				System.out.print(poly[i].coef + "x" + " ** " + poly[i].exp );
			else if(poly[i].exp == 1)
				System.out.print(poly[i].coef + "x" );
			else 
				System.out.print(poly[i].coef);

			if (i != poly.length-1) 
				System.out.print(" + ");
			else 
				System.out.println("\n");
		}
	}

	static void AddTerm(Term[]a, Term[]b, Term[]c) {
		int p = 0; int q=0; int r=0; 
		while(p<a.length && q < b.length) {
			if (a[p].exp == b[q].exp) {
				c[r].coef= a[p].coef + b[q].coef ;
				c[r].exp = a[p].exp; 
				p++; r++; q++; 
			}
		}		
		while(p<a.length) {
			c[r].coef = a[p].coef ; 
			c[r].exp = a[p].exp; 
			r++; p++; 
		}		
		while(q<b.length) {
			c[r].coef = b[q].coef; 
			c[r].exp = b[q].exp; 
			r++; q++; 
		}
	}

	static void MultiplyTerm(Term[] a, Term[] b, Term[] c) {
		int p=0; int q=0; int r=0; 
		while(p < a.length && q < b.length) {
			c[r].exp = a[p].exp + b[q].exp; 
			c[r].coef = a[p].coef * b[q].coef;
			p++; q++; 
			for(int i=0; i < r; i++) {
				if (c[i].exp == c[r].exp) {
					c[i].coef += c[r].coef; 
				} else r++; 
			}
		}		
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
		//		ShowPolynomial(polynomialY);
		//		MultiplyTerm(polynomialX,polynomialY,z);//다항식 곱셈 z = x * y
		//		ShowPolynomial(polynomialY);
		//		int result = EvaluateTerm(z, 10);//다항식 값 계산 함수 z(10) 값 계산한다 
		//		System.out.println(" result = " + result );
	}
}
