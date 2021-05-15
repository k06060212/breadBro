package chap04;

public class Sample09 {

	public static void main(String[] args) {
		// 두 값이 모두 0일 때만 0이고 나머지는 1입니다.
		
		int a = 60;		
		int b = -10;
//		System.out.println(Integer.toBinaryString(a));	// 0000 0000 0000 0000 0000 0000 0011 1100
//		System.out.println(Integer.toBinaryString(b));	// 1111 1111 1111 1111 1111 1111 1111 0110
		
		System.out.println("* OR");
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a), a);
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(b), b);
		System.out.println("=========================================");
		// AND 연산은 모두 1이면 1 , 0이 포함되면 0이 된다.
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a | b), a | b);
		System.out.println("");
		
	}

}
