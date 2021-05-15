package chap04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/**
		 * 정수의 값을 입력받고 입력받은 값이 양의 정수이면 그냥 출력하고 
		 * 음의 정수이면 양의 정수로 변환하여 출력하세요
		 * 
		 *	예)
		 *	정수의 값을 입력하세요 : 4
		 *	출력값 : 4
		 *
		 *	정수의 값을 입력하세요 : -4
		 *	출력값 : 4
		 */
		
		System.out.println("정수의 값을 입력 받고 양, 음의 정수 관계없이 양의 정수로 출력합니다.");
		System.out.println("정수의 값을 입력하세요 :");
		
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		if(in >= 0) {
			System.out.println("출력값 : " + in);
		}else if(in < 0) {
			System.out.println("출력값 : " + in * (-1));
		}else{
			System.out.println("올바르지 않은 값입니다.");
		}
		
		int result;
		result = (in >= 0) ? in : in*(-1);
		System.out.printf("출력값 : %d", result);
	}
}
