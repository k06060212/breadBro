package chap07;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		// 입력받은 수가 양수인지 음수인지 판단하는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력받은 수가 양수인지 음수인지 판단하는 프로그램");
		System.out.print("숫자를 입력하세요! >");
		
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.printf("%d는 음수 입니다.", num);
		}else {
			System.out.printf("%d는 양수 입니다.", num);
		}
	}
}
