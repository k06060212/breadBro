package chap04;

public class Sample08_01 {
	public static void main(String[] args) {
		//	2. int 자료형을 2진수로 표시하는 방법으로 Integer.toBinaryString() 메서드를 활용한다.
		
		int a = 60;		// 0000 0000 0000 0000 0000 0000 0011 1100
		int b = -10;	// 1111 1111 1111 1111 1111 1111 1111 0110
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("* AND");
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a), a);
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(b), b);
		System.out.println("=========================================");
		// AND 연산은 모두 1이면 1 , 0이 포함되면 0이 된다.
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a & b), a & b);
		
	}
}
