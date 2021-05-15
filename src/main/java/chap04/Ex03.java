package chap04;

public class Ex03 {
	public static void main(String[] args) {
		// 다음 소스코드만 보고 값을 예측해서 실행된 값과 비교해보세요
		int a = 10;
		int b = 20;
		
		int r1 = ++a + ++b;
		int r2 = a++ + b++;
		int r3 = b++ - --a;
		int r4 = --a + a--;
		int r5 = b+=++a;
		
		System.out.println(r1);	// 11 + 21 = 32
		System.out.println(r2);	// 11 + 21 = 32	-> 12, 22
		System.out.println(r3);	// 22 - 11 = 11 -> 11, 23 
		System.out.println(r4);	// 10 + 10 = 20 -> 9, 23
		System.out.println(r5);	// 23 +  10 = 33
	}
}
