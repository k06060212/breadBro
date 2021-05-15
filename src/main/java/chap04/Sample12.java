package chap04;

public class Sample12 {

	public static void main(String[] args) {
		// 변위 값만큼 왼쪽으로 이동합니다.
		// 왼쪽으로 이동하게 되면서 빈 공간이 '0'으로 채워진다.
		
		int a = 60;		
		int b = -10;
//		System.out.println(Integer.toBinaryString(a));	// 0000 0000 0000 0000 0000 0000 0011 1100
//		System.out.println(Integer.toBinaryString(b));	// 1111 1111 1111 1111 1111 1111 1111 0110
		
		System.out.println("*  << ");
		System.out.printf("[%32s] << 4 [%32s] = %d\n", 
				Integer.toBinaryString(a), 
				Integer.toBinaryString(a << 4), a<< 4);
		
		System.out.printf("[%32s] << 4 [%32s] = %d\n", 
				Integer.toBinaryString(b), 
				Integer.toBinaryString(b << 4), b<< 4);
			
	}

}
