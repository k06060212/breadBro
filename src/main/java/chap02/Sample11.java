package chap02;

import java.util.Scanner;

//Scanner
public class Sample11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String in = new String("입력값");
//		System.out.println(in);
//		String in = sc.next();	// 키보드로부터 문자열을 입력 받는 것
//		String in2 = sc.next();	// 키보드로부터 문자열을 입력 받는 것
//		int inNum = sc.nextInt();
//		long inLong = sc.nextLong();
//		char inChar = sc.next().charAt(0); 	
//		System.out.printf("입력한 값 : %s\n글자 수 : %d\n", in, in.length());
//		System.out.printf("입력한 값 : %s\n글자 수 : %d\n", in2, in2.length());
		
		// apple banana 
		// 1234 5678
		
		String in = sc.nextLine();
		
		System.out.printf("입력한 값 : [%s]\n글자 수 : %d\n", in.toUpperCase().trim()
				, in.toUpperCase().trim().length());
		
		// trim 공백 제거
		
	}
}