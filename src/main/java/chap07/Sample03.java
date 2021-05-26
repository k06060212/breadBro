package chap07;

import java.util.Scanner;

public class Sample03 {
	public static void main(String[] args) {
		// 키보드로부터 입력받은 값이 홀수인지 짝수인지 판단하는 프로그램

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		int in;
//		
//		if(a % 2 != 0) {
//			System.out.println("a는 홀수입니다.");
//		}else {
//			System.out.println("a는 짝수입니다.");
//		}
		
		// while문으로 계속 입력 받는 법
		
		while(sc.hasNext()) {
			in = sc.nextInt();
			
			if(in % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			} 
			System.out.print("숫자를 입력하세요 : ");
		}
	}
}
