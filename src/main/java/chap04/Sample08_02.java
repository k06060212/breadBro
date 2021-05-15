package chap04;

public class Sample08_02 {

	public static void main(String[] args) {
	// 	Sample08의 수정 왼쪽 문자열을 0 으로 채우기
	//	lpad() 메서드를 만들어본다.
	// 	lpad(String context, int len, String ch)를 호출하여 왼쪽 패딩 문자를 채워준다.
	// 	32자리인 이유는 int 자료형은 4Byte이기 때문
		
		int a = 60;		// 0000 0000 0000 0000 0000 0000 0011 1100
		int b = -10;	// 1111 1111 1111 1111 1111 1111 1111 0110
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
			
		System.out.println("* AND");
		System.out.printf("[%32s] %d\n", lpad(Integer.toBinaryString(a), 32, "0"), a);
		System.out.printf("[%32s] %d\n", lpad(Integer.toBinaryString(b), 32, "0"), b);
		System.out.println("=========================================");
		// AND 연산은 모두 1이면 1 , 0이 포함되면 0이 된다.
		System.out.printf("[%32s] %d\n", lpad(Integer.toBinaryString(a & b), 32, "0"),a & b);
	}
	
	// 왼쪽 문자열 0 으로 채움
	public static String lpad(String context, int len, String ch) {
		String str = context;
		if(context.length() < len) {	
			for(int i = 0; i < len - context.length(); i++) {
				str = ch + str;
			}
		}
		return str;
	}

}
