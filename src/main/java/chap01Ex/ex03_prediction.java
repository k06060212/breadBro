package chap01Ex;

/**
 * @author k0606
 * 문제 : 다음 소스코드만 보고 값을 예측해서 실행된 값과 비교해보세요.
 */
public class ex03_prediction {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int r1 = ++a + ++b;	// 11 + 21 = 32
		int r2 = a++ + b++; // 11 + 21 = 32  12  22
		int r3 = b++ - --a; // 22 - 11 = 11  11  23
		int r4 = --a + a--; // 10 + 10 = 20  9
		int r5 = b += ++a; 	// 23 + 10 = 33
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}
}
