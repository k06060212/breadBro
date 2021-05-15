package chap04;

public class Sample11 {

	public static void main(String[] args) {
		// 단항 연산자로 피연산자의 보수를 구하는 연산자입니다. 1은 0으로, 0은 1로 서로 반대되는 값을 구합니다.
		
		int a = 60;		
		int b = -10;
//		System.out.println(Integer.toBinaryString(a));	// 0000 0000 0000 0000 0000 0000 0011 1100
//		System.out.println(Integer.toBinaryString(b));	// 1111 1111 1111 1111 1111 1111 1111 0110
		
		System.out.println("* NOT");
		System.out.printf("[%32s] ~ [%32s] = %d ~ %d\n", 
				Integer.toBinaryString(a), 
				Integer.toBinaryString(~a), 
				a, 
				~a);
		
		System.out.printf("[%32s] ~ [%32s] = %d ~ %d\n", 
				Integer.toBinaryString(b), 
				Integer.toBinaryString(~b), 
				b, 
				~b);
			
	}

}
