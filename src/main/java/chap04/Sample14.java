package chap04;

public class Sample14 {

	public static void main(String[] args) {
		// Unsigned right shift
		// >> 연산자와 비슷한데 오른족으로 변위 비트만큼 이동하고 왼쪽의 빈공간을 모두 0으로 채운다.
		// 맨 왼쪽 비트가 음수를 나타내는 비트인데 그 비트마저도 0으로 채우게 되어서 음수가 양수로 되어버린다.
		// 음수를 사용할 때는 >> 연산자를 사용해야 한다.
		
		int a = 60;		
		int b = -10;
//		System.out.println(Integer.toBinaryString(a));	// 0000 0000 0000 0000 0000 0000 0011 1100
//		System.out.println(Integer.toBinaryString(b));	// 1111 1111 1111 1111 1111 1111 1111 0110
		
		System.out.println("*  >>> ");
		System.out.printf("[%32s] >> 4 [%32s] = %d\n", 
				lpad(Integer.toBinaryString(a), 32, "0") ,
				lpad(Integer.toBinaryString(a >>> 4), 32, "0"), a >>> 4);
		
		System.out.printf("[%32s] >> 4 [%32s] = %d\n", 
				lpad(Integer.toBinaryString(b), 32, "0"),
				lpad(Integer.toBinaryString(b >>> 4), 32, "0"), b >>> 4);
			
	}
	
	// 왼쪽 문자열 0으로 채움
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
