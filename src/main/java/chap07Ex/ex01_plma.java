package chap07Ex;

import java.util.Scanner;

/**
 * @author k0606
 *
 * 문제 : 입력받은 수가 양수인지 음수인지 판단하는 프로그램을 작성하세요
 * 
 * 출력 예 :	정수를 입력하세요 : 7
 * 			7은 양수입니다.
 * 
 * 			정수를 입력하세요 : -7
 * 			-7은 음수입니다.
 */
public class ex01_plma {
	public static void main(String[] args) {
		System.out.println("입력받은 수가 양수인지 음수인지 판단하는 프로그램입니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int in = sc.nextInt();
		
		if(in > 0) {
			System.out.printf("%d은 양수입니다.", in);
		}else {
			System.out.printf("%d은 음수입니다.", in);
		}
		
	}
}
