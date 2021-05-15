package chap04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 두 개의 값을 입력받아서 큰 수를 출력하세요. ( 단, 같으면 0으로 출력 )
		
		/* 	예1.
			
			답 입력 > 30 20 
			출력 > 30
			
			예2.
			
			답 입력 > 4 4 
			출력 > 0
		*/
		System.out.println("두 개의 값을 입력 받아 큰 값을 출력합니다. 예 30 20");
		System.out.println("답 입력 >");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if (a > b) {
			System.out.println("출력 >" + a);
		}else if(a < b) {
			System.out.println("출력 >" +b);
		}else if(a == b) {
			System.out.println("출력 >" + "0");
		}else {
			System.out.println("숫자를 입력하세요");
		}
		
		int result;
		
		result = (a > b) ? a : (a == b) ? 0 : b ;
		System.out.printf("입력한 값 중 큰 값은 %d 입니다.", result);
		
		
	}

}
