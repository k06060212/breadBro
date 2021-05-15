package chap04;

public class Sample13 {

	public static void main(String[] args) {
		// 변위 값만큼 오른쪽으로 이동합니다.
		// 오른족으로 이동해서 왼쪽에는 0이 채워지고 오른쪽의 n개수 bit가 사라진다.
		// 음수의 경우에는 음수를 유지하기 위해서 '1'이 채워진다는 점을 주의해야 한다.
		
		int a = 60;		
		int b = -10;
//		System.out.println(Integer.toBinaryString(a));	// 0000 0000 0000 0000 0000 0000 0011 1100
//		System.out.println(Integer.toBinaryString(b));	// 1111 1111 1111 1111 1111 1111 1111 0110
		
		System.out.println("*  >> ");
		System.out.printf("[%32s] >> 4 [%32s] = %d\n", 
				Integer.toBinaryString(a), 
				Integer.toBinaryString(a >> 4), a>> 4);
		
		System.out.printf("[%32s] >> 4 [%32s] = %d\n", 
				Integer.toBinaryString(b), 
				Integer.toBinaryString(b >> 4), b>> 4);
			
	}

}
