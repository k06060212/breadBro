package chap02;

public class Sample01 {
	
	public static void main(String[] args) {

//		[변수의 자료형] [변수명] =  리터럴
		
//		기본 자료형
//		1. 논리형
//		2. 문자형
//		3. 숫자형
		
//		숫자형
		int score = 100;
		score = score + 200;
		System.out.printf("%d", score);
		
		System.out.println("==========================");
//		논리형(보통 변수명 앞에 is를 붙여준다. 존재 하느냐 하지 않느냐, has 가지고 있느냐 가지고 있지 않느냐)
		boolean isExist = true;
		boolean hasClass = true;
		
		System.out.println("==========================");
//		문자형
		char chr = 'A';
		System.out.println("char : " + chr); 			// 문자
		System.out.println("Incoding : " + (int)chr);	//
		System.out.println("Decoding : " + (char)65);	//
		
	}
}