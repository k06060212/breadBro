package chap02;

public class Sample07 {

	public static void main(String[] args) {
		
		// 묵시적 형 변환
		short a = 32767;	//short 최대값
		int   b = 5000000; 	
		
		b = a; 	// 묵시적 형 변환
		System.out.println(b);
	}
}
