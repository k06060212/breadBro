package chap08.vo;

public class Sample04 {
	
	static int total = 0;
	public static void main(String[] args) {
		System.out.printf("결과 : %d\n", sum(1));
		System.out.printf("결과 : %d\n", sum(2,3));
		System.out.printf("결과 : %d\n", sum(4,5,6));
		System.out.printf("결과 : %d\n", sum(7,8,9,10,11,12,13,14,15,16));
	}
	
	public static int sum(int a) {
		total += a;
		return total;
	}
	
	public static int sum(int a, int b) {
		total += (a + b);
		return total;
	}

	public static int sum(int a, int b, int c) {
		total += (a + b);
		return total;
	}
	
//	또는 아래와 같이
//	주의점은 가변인자는 1개만 올 수 있다.
	public static int sum(int... a) {
		for(int i : a) total += i;
		return total;
	}
	
}
